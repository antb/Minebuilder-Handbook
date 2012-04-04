package com.xenoxis.minebuilderhandbook;

//import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MinebuilderHandbookActivity extends Activity {
	public static final String TAG = "MBHB";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Spinner dropbox_items = (Spinner) findViewById(R.id.dropbox_items);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.crafted_items,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		dropbox_items.setOnItemSelectedListener(new showHowTo());
		dropbox_items.setAdapter(adapter);

		final Button aboutButton = (Button) findViewById(R.id.about);
		aboutButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				AlertDialog aboutBox = new AlertDialog.Builder(
						MinebuilderHandbookActivity.this).create();
				aboutBox.setTitle("About...");
				aboutBox.setMessage(getString(R.string.about));
				aboutBox.setButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

					}
				});
				aboutBox.show();
			}
		});
	}

	public class showHowTo implements OnItemSelectedListener {

		public void onItemSelected(AdapterView<?> parent, View view, int pos,
				long id) {

			String itemToMake = parent.getItemAtPosition(pos).toString();
			if (itemToMake.equals("Bedrock"))
				changeBox(7,R.drawable.block_bedrock, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Brick"))
				changeBox(45, R.drawable.block_brick, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Bucket"))
				changeBox(325, R.drawable.item_bucket, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.blank);

			else if (itemToMake.equals("Bucket (Lava)"))
				changeBox(327, R.drawable.item_bucket_lava, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Bucket (Water)"))
				changeBox(326, R.drawable.item_bucket_water, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Carrot"))
				changeBox(103, R.drawable.item_carrot,  R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Coal"))
				changeBox(263, R.drawable.item_coal, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Coal Ore"))
				changeBox(16, R.drawable.block_coal_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Chest"))
				changeBox(54, R.drawable.block_chest, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.block_planks);

			else if (itemToMake.equals("Cobblestone"))
				changeBox(4, R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Diamond"))
				changeBox(264, R.drawable.item_diamond, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
	
			else if (itemToMake.equals("Diamond Block"))
				changeBox(57, R.drawable.block_diamond, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Diamond Ore"))
				changeBox(56, R.drawable.block_diamond_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Dirt"))
				changeBox(3, R.drawable.block_dirt, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Door"))
				changeBox(64, R.drawable.block_door, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.blank, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.blank);

			else if (itemToMake.equals("Elevator"))
				changeBox(100, R.drawable.block_elevator, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.item_iron_bar, R.drawable.item_gold_bar,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar);

			else if (itemToMake.equals("Fire 1"))
				changeBox(400, R.drawable.item_fire,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone, R.drawable.item_coal,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone);

			else if (itemToMake.equals("Fire 8"))
				changeBox(400, R.drawable.item_fire, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.item_coal, R.drawable.blank,
						R.drawable.blank, R.drawable.item_fire,
						R.drawable.blank);

			else if (itemToMake.equals("Furnace"))
				changeBox(61, R.drawable.block_furnace, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Glass"))
				changeBox(20, R.drawable.block_glass, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.block_sand, R.drawable.blank,
						R.drawable.blank, R.drawable.item_fire,
						R.drawable.blank);

			else if (itemToMake.equals("Gold Bar"))
				changeBox(266, R.drawable.item_gold_bar, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.block_gold_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.item_fire,
						R.drawable.blank);

			else if (itemToMake.equals("Gold Block"))
				changeBox(41, R.drawable.block_gold, R.drawable.item_gold_bar,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar);
			
			else if (itemToMake.equals("Gold Ore"))
				changeBox(14, R.drawable.block_gold_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.blank);

			else if (itemToMake.equals("Hide"))
				changeBox(402, R.drawable.item_hide, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Gravel"))
				changeBox(13, R.drawable.block_gravel, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Iron Bar"))
				changeBox(265, R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.block_iron_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.item_fire,
						R.drawable.blank);

			else if (itemToMake.equals("Iron Block"))
				changeBox(42, R.drawable.block_iron, R.drawable.item_iron_bar,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar);

			else if (itemToMake.equals("Iron Ore"))
				changeBox(15, R.drawable.block_iron_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Ladder"))
				changeBox(65, R.drawable.item_ladder, R.drawable.item_stick,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.item_stick, R.drawable.item_stick,
						R.drawable.item_stick, R.drawable.item_stick,
						R.drawable.blank, R.drawable.item_stick);

			else if (itemToMake.equals("Lapiz"))
				changeBox(22, R.drawable.block_lapiz, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Lapiz Ore"))
				changeBox(21, R.drawable.block_lapiz_ore, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Lava"))
				changeBox(10, R.drawable.block_lava, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Leaves"))
				changeBox(18, R.drawable.block_leaves, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Obsidian"))
				changeBox(49, R.drawable.block_obsidian,
						R.drawable.block_stone, R.drawable.block_stone,
						R.drawable.block_stone, R.drawable.block_stone,
						R.drawable.block_stone, R.drawable.block_stone,
						R.drawable.block_stone, R.drawable.block_stone,
						R.drawable.block_stone);

			else if (itemToMake.equals("Plain Stone"))
				changeBox(1, R.drawable.block_stone, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.blank, R.drawable.item_fire,
						R.drawable.blank);

			else if (itemToMake.equals("Planks"))
				changeBox(5, R.drawable.block_planks, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.block_wood, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Potion"))
				changeBox(403,R.drawable.item_potion, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if(itemToMake.equals("Sand"))
				changeBox(12, R.drawable.block_sand,R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
						
			else if (itemToMake.equals("Sandstone"))
				changeBox(24, R.drawable.block_sandstone,
						R.drawable.block_sand, R.drawable.block_sand,
						R.drawable.blank, R.drawable.block_sand,
						R.drawable.block_sand, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Sapling"))
				changeBox(6, R.drawable.item_sapling, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);

			else if (itemToMake.equals("Sign"))
				changeBox(63, R.drawable.item_sign, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);

			else if (itemToMake.equals("Stick"))
				changeBox(280, R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.blank, R.drawable.block_planks,
						R.drawable.blank);

			else if (itemToMake.equals("Stone Slab"))
				changeBox(44, R.drawable.block_stone_slab, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("TNT"))
				changeBox(46,R.drawable.block_tnt,
						R.drawable.item_sulphur,R.drawable.item_sulphur,R.drawable.blank,
						R.drawable.item_sulphur,R.drawable.item_sulphur,R.drawable.blank,
						R.drawable.blank,R.drawable.blank,R.drawable.blank);
						
			else if (itemToMake.equals("Torch"))
				changeBox(50, R.drawable.item_torch, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.item_coal, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			
			else if (itemToMake.equals("Water"))
				changeBox(8,R.drawable.block_water, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Workbench"))
				changeBox(58, R.drawable.block_workbench,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.blank, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank);
			
			else if (itemToMake.equals("Wood"))
				changeBox(17, R.drawable.block_wood, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
/*Tools*/
			else if (itemToMake.equals("Wooden Axe"))
				changeBox(271, R.drawable.item_wooden_axe,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.blank, R.drawable.block_planks,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Stone Axe"))
				changeBox(275, R.drawable.item_stone_axe,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.block_cobblestone, R.drawable.item_stick,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Iron Axe"))
				changeBox(258, R.drawable.item_iron_axe,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.blank, R.drawable.item_iron_bar,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Golden Axe"))
				changeBox(286, R.drawable.item_gold_axe,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar,
						R.drawable.blank, R.drawable.item_gold_bar,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Diamond Axe"))
				changeBox(279, R.drawable.item_diamond_axe,
						R.drawable.item_diamond, R.drawable.item_diamond,
						R.drawable.blank, R.drawable.item_diamond,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Wooden Hoe"))
				changeBox(290, R.drawable.item_wooden_hoe,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Stone Hoe"))
				changeBox(291, R.drawable.item_stone_hoe,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Iron Hoe"))
				changeBox(292, R.drawable.item_iron_hoe,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Golden Hoe"))
				changeBox(294, R.drawable.item_gold_hoe,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Diamond Hoe"))
				changeBox(293, R.drawable.item_diamond_hoe,
						R.drawable.item_diamond, R.drawable.item_diamond,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Wooden Pickaxe"))
				changeBox(270, R.drawable.item_wooden_pickaxe,
						R.drawable.block_planks, R.drawable.block_planks,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Stone Pickaxe"))
				changeBox(274, R.drawable.item_stone_pickaxe,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			
			else if (itemToMake.equals("Iron Pickaxe"))
				changeBox(257, R.drawable.item_iron_pickaxe,
						R.drawable.item_iron_bar, R.drawable.item_iron_bar,
						R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			
			else if (itemToMake.equals("Golden Pickaxe"))
				changeBox(285, R.drawable.item_gold_pickaxe,
						R.drawable.item_gold_bar, R.drawable.item_gold_bar,
						R.drawable.item_gold_bar, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			
			else if (itemToMake.equals("Diamond Pickaxe"))
				changeBox(278, R.drawable.item_diamond_pickaxe,
						R.drawable.item_diamond, R.drawable.item_diamond,
						R.drawable.item_diamond, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			
			else if (itemToMake.equals("Wooden Shovel"))
				changeBox(269, R.drawable.item_wooden_shovel, R.drawable.blank,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			
			else if (itemToMake.equals("Stone Shovel"))
				changeBox(273, R.drawable.item_stone_shovel, R.drawable.blank,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			
			else if (itemToMake.equals("Iron Shovel"))
				changeBox(256, R.drawable.item_iron_shovel, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			
			else if (itemToMake.equals("Golden Shovel"))
				changeBox(284, R.drawable.item_gold_shovel, R.drawable.blank,
						R.drawable.item_gold_bar, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Diamond Shovel"))
				changeBox(277, R.drawable.item_diamond_shovel,
						R.drawable.blank, R.drawable.item_diamond,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank,
						R.drawable.blank, R.drawable.item_stick,
						R.drawable.blank);
			else if (itemToMake.equals("Wooden Sword"))
				changeBox(268, R.drawable.item_wooden_sword, R.drawable.blank,
						R.drawable.block_planks, R.drawable.blank,
						R.drawable.blank, R.drawable.block_planks,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Stone Sword"))
				changeBox(272, R.drawable.item_stone_sword, R.drawable.blank,
						R.drawable.block_cobblestone, R.drawable.blank,
						R.drawable.blank, R.drawable.block_cobblestone,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Iron Sword"))
				changeBox(267, R.drawable.item_iron_sword, R.drawable.blank,
						R.drawable.item_iron_bar, R.drawable.blank,
						R.drawable.blank, R.drawable.item_iron_bar,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Golden Sword"))
				changeBox(283, R.drawable.item_gold_sword, R.drawable.blank,
						R.drawable.item_gold_bar, R.drawable.blank,
				 		R.drawable.blank, R.drawable.item_gold_bar,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else if (itemToMake.equals("Diamond Sword"))
				changeBox(276, R.drawable.item_diamond_sword, R.drawable.blank,
						R.drawable.item_diamond, R.drawable.blank,
						R.drawable.blank, R.drawable.item_diamond,
						R.drawable.blank, R.drawable.blank,
						R.drawable.item_stick, R.drawable.blank);
			else {
				Toast toast = Toast.makeText(getApplicationContext(),
						R.string.no_id, Toast.LENGTH_SHORT);
				toast.show();
				changeBox(0, R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank,
						R.drawable.blank, R.drawable.blank);
			}
		}

		public void changeBox(int gid, int id0, int id1, int id2, int id3,
				int id4, int id5, int id6, int id7, int id8, int id9) {

			Log.i(TAG, "gid: " + gid + "\t id0: " + id0);
			Log.i(TAG, "id 1 2 3: " + id1 + " " + id2 + " " + id3);
			Log.i(TAG, "id 4 5 6: " + id4 + " " + id5 + " " + id6);
			Log.i(TAG, "id 7 8 9: " + id7 + " " + id8 + " " + id9);

			TextView SetID = (TextView) findViewById(R.id.mb_id);
			SetID.setText(R.string.ID);
			//SetID.append("\n");
			SetID.append(Integer.toString(gid));

			ImageView t0 = (ImageView) findViewById(R.id.crafted_item);
			t0.setImageResource(id0);
			ImageView t1 = (ImageView) findViewById(R.id.B1x1);
			t1.setImageResource(id1);
			ImageView t2 = (ImageView) findViewById(R.id.B2x1);
			t2.setImageResource(id2);
			ImageView t3 = (ImageView) findViewById(R.id.B3x1);
			t3.setImageResource(id3);
			ImageView t4 = (ImageView) findViewById(R.id.B1x2);
			t4.setImageResource(id4);
			ImageView t5 = (ImageView) findViewById(R.id.B2x2);
			t5.setImageResource(id5);
			ImageView t6 = (ImageView) findViewById(R.id.B3x2);
			t6.setImageResource(id6);
			ImageView t7 = (ImageView) findViewById(R.id.B1x3);
			t7.setImageResource(id7);
			ImageView t8 = (ImageView) findViewById(R.id.B2x3);
			t8.setImageResource(id8);
			ImageView t9 = (ImageView) findViewById(R.id.B3x3);
			t9.setImageResource(id9);
		}

		public void onNothingSelected(AdapterView<?> xyz) {
			// No non-selection option
		}

	}
}
