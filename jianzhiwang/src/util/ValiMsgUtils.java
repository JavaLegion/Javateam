package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;

public class ValiMsgUtils {

	//�˺�
	public static final String ACCOUNT_SID = "95edb126501b421690c505d60bdb7128";

	//TOKEN
	public static final String AUTH_TOKEN = "175db37ece1340358079c10a400fda3b";
	
	//ǩ��
	public static final String SIGNATURE = "webapp";
	
	//ģ��
	public static final String Content = "������֤��Ϊ��$������3��������ȷ���룬��Ǳ��˲���������Դ˶��š�";
	
	//���Բ��޸�
	public static final String RESP_DATA_TYPE = "json";	//JSON��XML
	public static final String operation = "/industrySMS/sendSMS";
	public static final String BASE_URL = "https://api.miaodiyun.com/20150822";
	
	private ValiMsgUtils(){}
	
	/**
	 * ����ָ��λ�������
	 * @return 
	 */
	static Random random = new Random();
	public static String randNum(int number){
		String result = "";
		for(int i=0;i<number;i++){
			result += random.nextInt(10);
		}
		return result;
	}
	
	/**
	 * ����ָ��λ��������֤��
	 */
	public static String send(String phone,int length){
		String num = randNum(length);
		return execute(phone,num)? num : "0";
	}
	
	/**
	 * ����6λ��������֤��
	 */
	public static String send(String phone){
		return send(phone,6);
	}
	
	/**
	 * ������֤��
	 */
	public static boolean execute(String phone,String num){
		String tmpSmsContent = null;
		String smsContent = "��" + SIGNATURE + "��" + Content.replace("$", num);
	    try{
	      tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
	    }catch(Exception e){
	    	
	    }
	    String url = BASE_URL + operation;
	    String body = "accountSid=" + ACCOUNT_SID + "&to=" + phone + "&smsContent=" + tmpSmsContent + createCommonParam();

	    // �ύ����
	    String result = post(url, body);
	    System.out.println("result:" + System.lineSeparator() + result);
	    return result.indexOf("����ɹ�")!=-1 ? true : false;
	}
	
	/**
	 * ����ͨ�ò���timestamp��sig��respDataType
	 * 
	 * @return
	 */
	public static String createCommonParam(){
		// ʱ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timestamp = sdf.format(new Date());

		// ǩ��
		String sig = DigestUtils.md5Hex(ACCOUNT_SID + AUTH_TOKEN + timestamp);
		
		return "&timestamp=" + timestamp + "&sig=" + sig + "&respDataType=" + RESP_DATA_TYPE;
	}

	/**
	 * post����
	 * 
	 * @param url
	 *            ���ܺͲ���
	 * @param body
	 *            Ҫpost������
	 * @return
	 * @throws IOException
	 */
	public static String post(String url, String body){
		//System.out.println("url:" + System.lineSeparator() + url);
		//System.out.println("body:" + System.lineSeparator() + body);

		String result = "";
		try{
			OutputStreamWriter out = null;
			BufferedReader in = null;
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();

			// �������Ӳ���
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(20000);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			// �ύ����
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(body);
			out.flush();

			// ��ȡ��������
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line = "";
			boolean firstLine = true; // ����һ�в��ӻ��з�
			while ((line = in.readLine()) != null){
				if (firstLine){
					firstLine = false;
				} else{
					result += System.lineSeparator();
				}
				result += line;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * �ص����Թ��߷���
	 * 
	 * @param url
	 * @param reqStr
	 * @return
	 */
	public static String postHuiDiao(String url, String body){
		String result = "";
		try{
			OutputStreamWriter out = null;
			BufferedReader in = null;
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();

			// �������Ӳ���
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(20000);

			// �ύ����
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(body);
			out.flush();

			// ��ȡ��������
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line = "";
			boolean firstLine = true; // ����һ�в��ӻ��з�
			while ((line = in.readLine()) != null){
				if (firstLine){
					firstLine = false;
				} else{
					result += System.lineSeparator();
				}
				result += line;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
}
