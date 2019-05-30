package net.meyki.skt.utils;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Knight on 2017/3/13.
 */

public class FormatMathEdit {

    public static void FormatMathEdit(EditText edittext, CharSequence s, int start, String before_text){
        String[] part_money;
        String str = s.toString();
        if(appearNumber(s.toString())>1){//如果小数点的数量大于1
            str = new String(before_text);
            edittext.setText(str);
            edittext.setSelection(start);//回复之前的数据
        }

        if (s.toString().contains("元")) {//如果文本中含有元，将元裁掉进行再进行数据判断
            if (s.toString().equals("元")) {//当文本中只含有“元”时
                str = "";
            } else {
                str = s.toString().split("元")[0].toString();
            }
        }

        if(!str.contains(".")&& str.length()>6){
            edittext.setText(before_text);
            edittext.setSelection(start);
//            before_text = str;
        }

        if(str.contains(".")&&!str.startsWith(".") &&str.split("\\.")[0].length()>6){
            edittext.setText(before_text);
            edittext.setSelection(start);

        }

        if(str.startsWith(".")){//补0
            str ="0" + str;
            edittext.setText(str);
            edittext.setSelection(2);
        }

        if(!str.equals("0") &&str.startsWith("0")&& !str.startsWith("0.")){//去除开头的0
            str = str.replaceAll("^0","");
            edittext.setText(str);
            edittext.setSelection(edittext.getText().length());
        }

        if(str.contains(".")&&!str.endsWith(".")){
            part_money = str.split("\\.");
            if(part_money[1].length()>2){//除小数点后2位
                part_money[1] = part_money[1].substring(0, 2);
                str = part_money[0] + "." + part_money[1];
                edittext.setText(str);
                edittext.setSelection(str.length());
            }

            if(part_money[1].length()>1 ){//除结尾0
                if(str.endsWith("0")){
                    str = str.replaceAll("0$", "");
                    edittext.setText(str);
                    edittext.setSelection(str.length());
                }
            }
        }
    }

    public static int appearNumber(String srcText) {
        int count = 0;
        Pattern p = Pattern.compile("\\.");
        Matcher m = p.matcher(srcText);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void AfterEdit(EditText minEdit, EditText maxEdit, Context context){


        String str_min = minEdit.getText().toString();
        str_min = str_min.replaceAll("元","");
        if(str_min.endsWith(".")){
            str_min = str_min.replaceAll("\\.","");
        }
        if(str_min.equals("")){
            minEdit.setText("");
        }else{
            minEdit.setText(str_min + "元");
        }


        String str_max = maxEdit.getText().toString();
        str_max = str_max.replaceAll("元","");
        if(str_max.endsWith(".")){
            str_max = str_max.replaceAll("\\.","");
        }
        if(str_max.equals("")){
            maxEdit.setText("");
        }else{
            maxEdit.setText(str_max + "元");
        }


        if(!str_min.equals("") && !str_max.equals("") && Double.parseDouble(str_min)>Double.parseDouble(str_max)){
            Toast.makeText(context,"价格区间输入有误，请重新输入",Toast.LENGTH_SHORT).show();
        }
    }



}
