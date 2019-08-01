package com.ychd.jasperpdf;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperRunManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;


public class PDFUtils {

	public static String jasperFilePath = "D:\\JaspersoftWorkspace\\MyReports\\";//模版文件

	public static String pdfFilePath = "D:\\JaspersoftWorkspace\\MyReports\\";//生成pdf文件

	//	public static String docxFilePath = "F:\\document\\report\\report1.docx";//生成wod文件

	//	public static String xlsxFilePath = "F:\\document\\report\\report1.xlsx";//生成excel文件

	/**

	 * 生成文件pdf*/

	public static void addPdf(HashMap<String, Object> params,String sourceName,String printName) {

		// 第一步：装载jasper文件

		File jasperFileName = new File(jasperFilePath+sourceName);

		// 第二步：设置参数值

		/* 设置参数 */


		// 第三步：利用JasperRunManager生成PDF文件
		try {

			JasperRunManager.runReportToPdfFile(jasperFileName.getPath(),pdfFilePath+printName,

					params, new JREmptyDataSource());

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public static void jiedai() throws FileNotFoundException {
		HashMap<String, Object> params = new HashMap<String, Object>();// 建立参数表

		params.put("repayCard","67676767676767676"); // 还款借记卡号
		params.put("applyId", "1234567890"); //申请编号
		params.put("applyDate", "2019年01-01");//申请日期
		params.put("repayCardBank", "招商银行");//开户行
		params.put("name", "张三");//姓名
		params.put("gender", "男");//性别
		params.put("birthDate", "1990年01-01"); //出生日期
		params.put("idNo", "14262519900101"); //身份证号码
		params.put("maritalStatus", "已婚");//婚姻状况
		params.put("eduLevel", "本科");//教育程度
		params.put("residence", "居住地");//居住地
		params.put("residenceOfID", "户籍所在地址");//户籍所在地址
		params.put("cellPhone1", "18911216975");//手机号1
		params.put("cellPhone2", "18911216975");//手机号2
		params.put("company", "易诚网络");//现单位名称
		params.put("comPhone", "010-8876576");//现单位电话
		params.put("comAddress", "北京市西小口");//现单位地址
		params.put("contactPeople1", "联系人1");//联系人1
		params.put("relation1", "父子");//关系1
		params.put("contactPhone1", "13366668888");//电话1
		params.put("contactPeople2", "联系人2");//联系人2
		params.put("relation2", "母子");//关系2
		params.put("contactPhone2", "18966668888");//电话2
		params.put("loanAmount", "30000");//贷款金额
		params.put("loanTerm", "12期");//贷款期限
		params.put("repayDay", "2019年12-30");//还款日
		params.put("repayWay", "等额本息");//还款方式
		params.put("loanUse", "装修");//贷款用途
		params.put("receiveName", "张三");//指定放款账户名
		params.put("receiveAccount", "8989898989898");//指定放款账号
		params.put("signDate", "2019年7月29日");//签约日期
        File   imageFile   =   new   File("E:\\test2.jpg");
        InputStream images   =   new FileInputStream(imageFile);
		params.put("images", images);

		addPdf(params,"ediandaitixian.jasper","ediandaitixian.pdf");
	}

	public static void dianziyanqian() throws FileNotFoundException {
		HashMap<String, Object> params = new HashMap<String, Object>();// 建立参数表
		params.put("repayCard","67676767676767676"); // 设置参数值
		params.put("applyId", "1234567890");
		params.put("applyDate", "2019年01-01");
		params.put("repayCardBank", "招商银行");
		params.put("name", "张三");
		params.put("gender", "男");
		params.put("birthDate", "1990年01-01");
		params.put("idNo", "14262519900101");
		params.put("maritalStatus", "已婚");
		params.put("eduLevel", "本科");
		params.put("residence", "居住地");
		params.put("residenceOfID", "户籍所在地址");
		params.put("cellPhone1", "18911216975");
		params.put("cellPhone2", "18911216975");
		params.put("company", "易诚网络");
		params.put("comPhone", "010-8876576");
		params.put("comAddress", "北京市西小口");
		params.put("contactPeople1", "联系人1");
		params.put("relation1", "父子");
		params.put("contactPhone1", "13366668888");
		params.put("contactPeople2", "联系人2");
		params.put("relation2", "母子");
		params.put("contactPhone2", "18966668888");
//		params.put("loanAmount", "30000");
//		params.put("loanTerm", "12期");
		params.put("repayDay", "2019年12-30");
		params.put("repayWay", "等额本息");
//		params.put("loanUse", "装修");
		params.put("receiveName", "张三");
		params.put("receiveAccount", "8989898989898");
		params.put("signDate", "2019年7月29日");
		File   imageFile   =   new   File("E:\\test2.jpg");
		InputStream images   =   new FileInputStream(imageFile);
		params.put("images", images);

		addPdf(params,"dianziqianming.jasper","dianziqianming.pdf");
	}

	public static void main(String[] args) {

		// 生成pdf文件

        try {
			//借贷
            PDFUtils.jiedai();
			//电子验签
			PDFUtils.dianziyanqian();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


		// 生成word文件

		//ReportUtil.addDocx();

		// 生成excel文件

		//ReportUtil.addXls();


	}
}
