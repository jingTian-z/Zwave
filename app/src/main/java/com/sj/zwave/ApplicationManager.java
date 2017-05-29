package com.sj.zwave;

import android.app.Activity;
import android.content.Context;

import java.util.Stack;

public class ApplicationManager {
    private static Stack<Activity> activityStack;
    private static ApplicationManager singletonIntance;

    private ApplicationManager(){

    }

    /**
     * 获取单例ApplicationManager
     **/
    public static ApplicationManager getApplicationManager(){
        if(singletonIntance == null){
            singletonIntance = new ApplicationManager();
        }
        return singletonIntance;
    }

    public void addActivity(Activity activity){
        if (activityStack == null){
            activityStack = new Stack<>();
        }
        activityStack.add(activity);
    }

    public Activity getCurrentActivity(){
        return activityStack.lastElement();
    }

    /**
     * 结束当前Activity
     */
    public void finishActivity(){
        finishActivity(activityStack.lastElement());
    }

    /**
     * 结束指定的Activity
     * @param activity
     */
    public void finishActivity(Activity activity){
        if(activity != null && !activity.isFinishing()){
            activityStack.remove(activity);
            activity.finish();
        }
    }

    public void  finishActivity(Class<?> cls){
        for (Activity activity : activityStack){
            activity.getClass().equals(cls);
            finishActivity(activity);
            break;
        }
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity(){
        if (activityStack != null){
            for (Activity activity : activityStack){
                finishActivity(activity);
            }
        }
        /*for (int k = 0; k < activityStack.size(); k++){
            if (activityStack.get(k) != null)
            finishActivity(activityStack.get(k));
        }*/
        activityStack.clear();
    }
    /**
     * 获取指定的Activity
     * @param clazz
     * @return Activity
     */
    public static Activity getActivity(Class<?> clazz){
        if (activityStack != null){
            for (Activity activity : activityStack){
                if (activity.getClass().equals(clazz)){
                    return activity;
                }
            }
        }
        return null;
    }

    /**
     * 应用退出
     * @param context
     */
    public void ApplicationExit(Context context){
        try {
            finishAllActivity();
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
