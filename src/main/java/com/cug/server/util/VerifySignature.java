package com.cug.server.util;

import cn.xjfme.encrypt.utils.Util;
import cn.xjfme.encrypt.utils.sm2.SM2SignVO;
import cn.xjfme.encrypt.utils.sm2.SM2SignVerUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


/**
 * @Author: gg
 * @Time: 2021/12/15  20:33
 * 私钥签名信息的验证，验证成功返回原文信息，List<String>形式
 */
public class VerifySignature {

    public static JSONArray verify(JSONArray accArr) throws Exception {
        //list包含两个事故车的签名信息，形如[{pk,sign,org},{pk,sign,org}]，分别对两个签名进行验证。

        JSONArray ja = new JSONArray();
        for( int i = 0 ; i < accArr.size() ; i++) {
            JSONObject tmp = (JSONObject) accArr.getJSONObject(i).get("signData");
            ja.add(tmp.getString("orgObj"));
            //boolean b = verify(tmp);
        }
        return ja;
    }

    //验证函数，传入签名对象{公钥、签名、原文}
    public static boolean verify(JSONObject signObj) throws Exception {

        //签名的原内容orgObj（TS,AID）,将其转成Hex字符串
        String org = signObj.getString("orgObj");
        String orgHex = Util.byteToHex(org.getBytes());

        //读入RSU公钥
        String pk_v = signObj.getString("pk");

        //读入签名内容
        String sign = signObj.getString("sign");

        //验签，用车的公钥验签；（公钥，原文，签名内容）
        return verifySM2Signature(pk_v.trim(), orgHex, sign);
    }

    public static boolean verifySM2Signature(String pubKey, String sourceData, String hardSign) {
        SM2SignVO verify = SM2SignVerUtils.VerifySignSM2(Util.hexStringToBytes(pubKey), Util.hexToByte(sourceData), Util.hexToByte(hardSign));
        return verify.isVerify();
    }

}
