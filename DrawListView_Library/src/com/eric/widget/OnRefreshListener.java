package com.eric.widget;

/**
 * @author andong
 * RefreshListViewˢ���¼��ļ���
 */
public interface OnRefreshListener {

	/**
	 * ������ˢ��ʱ����
	 */
	public void onRefresh();
	
	/**
	 * �����ظ���ʱ�ص�
	 */
	public void onLoadMoreData();
}