package models.validators;

import java.util.ArrayList;
import java.util.List;

import actions.views.ReportView;
import constants.MessageConst;

/**
 * 日報インスタンスに設定されている値のバリデーションを行うクラス
 */
public class ReportValidator {

    /**
     * 日報インスタンスの各項目についてバリデーションを行う
     * @param rv 日報インスタンス
     * @return エラーのリスト
     */
    public static List<String> validate(ReportView rv) {
        List<String> errors = new ArrayList<String>();

        //タイトルのチェック
        String titleError = validateTitle(rv.getTitle());
        if (!titleError.equals("")) {
            errors.add(titleError);
        }

        //内容のチェック
        String contentError = validateContent(rv.getContent());
        if (!contentError.equals("")) {
            errors.add(contentError);
        }

        //出勤時間のチェック
        String startWorkError = validateStartWork(rv.getStart_work());
        if (!startWorkError.equals("")) {
            errors.add(startWorkError);
        }

        //退勤時間のチェック
        String finishWorkError = validateFinishWork(rv.getFinish_work());
        if (!finishWorkError.equals("")) {
            errors.add(finishWorkError);
        }

        return errors;
    }

    /**
     * タイトルに入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param title タイトル
     * @return エラーメッセージ
     */
    private static String validateTitle(String title) {
        if (title == null || title.equals("")) {
            return MessageConst.E_NOTITLE.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

    /**
     * 内容に入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param content 内容
     * @return エラーメッセージ
     */
    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return MessageConst.E_NOCONTENT.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

    /**
     * 出勤時間に入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param startWork 出勤時間
     * @return エラーメッセージ
     */
    private static String validateStartWork(String startWork) {
        if (startWork == null || startWork.equals("")) {
            return MessageConst.E_NOSTART_WORK.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

    /**
     * 退勤時間に入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param finishWork 出勤時間
     * @return エラーメッセージ
     */
    private static String validateFinishWork(String finishWork) {
        if (finishWork == null || finishWork.equals("")) {
            return MessageConst.E_NOFINISH_WORK.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

}