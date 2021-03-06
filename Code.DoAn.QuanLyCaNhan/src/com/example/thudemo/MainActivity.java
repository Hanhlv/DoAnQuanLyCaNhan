package com.example.thudemo;

import java.util.ArrayList;

import Database.DataAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	public static DataAdapter data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);

		data = new DataAdapter(getApplicationContext());
		data.createDB();	
		ArrayList<Itemlist> image_details = GetSearchResults();

		final ListView lv1 = (ListView) findViewById(R.id.list);
		lv1.setAdapter(new BinderData(this, image_details));

		lv1.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				case 0:
					Intent khoanchi = new Intent(MainActivity.this,KhoanChi_acitive.class);
					startActivity(khoanchi);
					break;
				case 1:
					Intent khoangthu = new Intent(MainActivity.this,KhoanThu_acitive.class);
					startActivity(khoangthu);
					break;
				case 2:
					Intent khoangno = new Intent(MainActivity.this,
							KhoanNo_acitivite.class);
					startActivity(khoangno);
					break;
				case 3:
					Intent khoangvay = new Intent(MainActivity.this,
							khoanvay_activite.class);
					startActivity(khoangvay);
					break;
				case 4:
					Intent theloai = new Intent(MainActivity.this,
							TheLoai_acitivite.class);
					startActivity(theloai);
					break;
				case 5:
					Intent thongke = new Intent(MainActivity.this,Thongke_acitive.class);
					startActivity(thongke);
					break;
				case 6:
					Intent timkiem = new Intent(MainActivity.this,TimKiem_activite.class);
					startActivity(timkiem);
					break;
				case 7:
					Intent huongdan = new Intent(MainActivity.this,HuongDan_activite.class);
					startActivity(huongdan);
					break;
				}
				
			}
		});
	}

	private ArrayList<Itemlist> GetSearchResults() {
		ArrayList<Itemlist> results = new ArrayList<Itemlist>();

		Itemlist item_details = new Itemlist();
		item_details.setName("CÁC KHOẢN CHI RA");
		item_details.setItemDescription("Các khoản tiền chi phí sinh hoạt, công việc...");
		item_details.setImageNumber(1);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("CÁC KHOẢN THU VÀO");
		item_details.setItemDescription("Tiền tiết kiệm, lương, thưởng...");
		item_details.setImageNumber(2);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("CÁC KHOẢN NỢ");
		item_details.setItemDescription("Khoản tiền mình đang mượn...");
		item_details.setImageNumber(3);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("CÁC KHOẢN CHO VAY");
		item_details.setItemDescription("Khoản mình cho vay, cho mượn");
		item_details.setImageNumber(4);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("THỂ LOẠI");
		item_details.setItemDescription("Tên danh mục thu chi");
		item_details.setImageNumber(5);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("THỐNG KÊ");
		item_details.setItemDescription("Thống kê dạng biểu đồ tròn");
		item_details.setImageNumber(6);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("TÌM KIẾM");
		item_details.setItemDescription("Tìm kiếm các khoản thu,chi,vay,nợ");
		item_details.setImageNumber(7);
		results.add(item_details);

		item_details = new Itemlist();
		item_details.setName("HƯỚNG DẪN");
		item_details.setItemDescription("Hướng dẫn sử dụng");
		item_details.setImageNumber(8);
		results.add(item_details);

		return results;
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater blowUp = getMenuInflater();
        blowUp.inflate(R.menu.main, menu);
        return true;
    }
   

}
