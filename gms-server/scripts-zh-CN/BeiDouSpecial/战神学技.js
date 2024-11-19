/*
脚本：战神学技能
作者：小海豚
日期：2024-11-18
备注：
 */




function start() 
{
  action(1, 0, 0);
}

function action(mode, type, selection) 
{
	 if (cm.getJobId() >= 2100) {
	cm.sendOk("学习技能！");
				cm.teachSkill(21000000, 0, 0, -1);
				cm.teachSkill(21001003, 0, 0, -1);
	
				cm.teachSkill(21100000, 0, 0, -1);
				cm.teachSkill(21100002, 0, 0, -1);
				cm.teachSkill(21100004, 0, 0, -1);
				cm.teachSkill(21100005, 0, 0, -1);
				cm.teachSkill(21101003, 0, 0, -1);
				
				cm.teachSkill(21110002, 0, 0, -1);
	 }
	 else { cm.sendOk("一边去");}
	cm.dispose();
	 		
}

