package com.unnng.veldora.fishing.data.local;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.entity.Fish;

import java.util.ArrayList;
import java.util.List;

public class FishResources {

    public static List<Fish> fishList = new ArrayList<>();

    static {

        // 白色（普通） - 废弃物和低价值鱼类，30种
        fishList.add(new Fish(1, "破损的螺壳", Rarity.COMMON, 5.0, "废弃的螺壳，毫无价值，偶尔被鱼钩挂起。"));
        fishList.add(new Fish(2, "发霉的水草", Rarity.COMMON, 3.0, "腐烂的水草，散发恶臭，无人问津。"));
        fishList.add(new Fish(3, "旧鱼钩", Rarity.COMMON, 4.0, "生锈的鱼钩，可能是其他钓手遗失的。"));
        fishList.add(new Fish(4, "碎贝壳", Rarity.COMMON, 2.0, "破碎的贝壳碎片，偶尔在浅滩被钓起。"));
        fishList.add(new Fish(5, "海藻团", Rarity.COMMON, 3.5, "一团湿漉漉的海藻，毫无用处。"));
        fishList.add(new Fish(6, "烂木头", Rarity.COMMON, 2.5, "漂浮的腐木，可能是沉船残骸。"));
        fishList.add(new Fish(7, "塑料瓶", Rarity.COMMON, 1.0, "被污染的废弃物，影响水质。"));
        fishList.add(new Fish(8, "破渔网", Rarity.COMMON, 4.5, "破损的渔网，缠在鱼钩上。"));
        fishList.add(new Fish(9, "生锈的铁罐", Rarity.COMMON, 3.0, "废弃的铁罐，毫无价值。"));
        fishList.add(new Fish(10, "泥巴团", Rarity.COMMON, 1.5, "一团河底的淤泥，脏兮兮。"));
        fishList.add(new Fish(11, "鲤鱼", Rarity.COMMON, 25.0, "常见淡水鱼，市场需求稳定。"));
        fishList.add(new Fish(12, "鲫鱼", Rarity.COMMON, 20.0, "小型淡水鱼，适合新手捕获。"));
        fishList.add(new Fish(13, "银鱼", Rarity.COMMON, 15.0, "小型淡水鱼，适合制作鱼干。"));
        fishList.add(new Fish(14, "沙丁鱼", Rarity.COMMON, 18.0, "小型鱼类，成群出现，适合批量出售。"));
        fishList.add(new Fish(15, "鳁鱼", Rarity.COMMON, 22.0, "常见沿海鱼类，肉质普通。"));
        fishList.add(new Fish(16, "鲻鱼", Rarity.COMMON, 20.0, "常见海鱼，价值一般。"));
        fishList.add(new Fish(17, "泥鳅", Rarity.COMMON, 15.0, "底栖鱼类，适合初学者。"));
        fishList.add(new Fish(18, "小黄鱼", Rarity.COMMON, 25.0, "小型黄鱼，市场需求稳定。"));
        fishList.add(new Fish(19, "鲢鱼", Rarity.COMMON, 23.0, "淡水鱼，体型稍大，价值普通。"));
        fishList.add(new Fish(20, "草鱼", Rarity.COMMON, 28.0, "常见淡水鱼，肉质鲜美。"));
        fishList.add(new Fish(21, "青鱼", Rarity.COMMON, 26.0, "淡水鱼，适合烹饪。"));
        fishList.add(new Fish(22, "鳗鱼", Rarity.COMMON, 30.0, "细长鱼类，稍有价值。"));
        fishList.add(new Fish(23, "黄颡鱼", Rarity.COMMON, 20.0, "小型掠食鱼，常见于河流。"));
        fishList.add(new Fish(24, "鲮鱼", Rarity.COMMON, 18.0, "小型淡水鱼，价值较低。"));
        fishList.add(new Fish(25, "鳊鱼", Rarity.COMMON, 22.0, "淡水鱼，适合新手捕获。"));
        fishList.add(new Fish(26, "鲥鱼", Rarity.COMMON, 25.0, "小型海鱼，市场需求一般。"));
        fishList.add(new Fish(27, "白条鱼", Rarity.COMMON, 15.0, "小型淡水鱼，常见于湖泊。"));
        fishList.add(new Fish(28, "乌鱼", Rarity.COMMON, 20.0, "常见鱼类，价值普通。"));
        fishList.add(new Fish(29, "鲈鱼苗", Rarity.COMMON, 18.0, "幼年鲈鱼，价值较低。"));
        fishList.add(new Fish(30, "鲶鱼苗", Rarity.COMMON, 15.0, "幼年鲶鱼，常见于泥底。"));

        // 绿色（普通） - 常见现实鱼类，30种
        fishList.add(new Fish(31, "鲈鱼", Rarity.UNCOMMON, 60.0, "中等鱼类，肉质鲜美，市场需求高。"));
        fishList.add(new Fish(32, "鳟鱼", Rarity.UNCOMMON, 45.0, "常见溪流鱼，味道鲜美，价值稳定。"));
        fishList.add(new Fish(33, "鲶鱼", Rarity.UNCOMMON, 50.0, "底栖鱼类，皮革可用于工艺。"));
        fishList.add(new Fish(34, "罗非鱼", Rarity.UNCOMMON, 35.0, "热带鱼类，繁殖快，市场需求稳定。"));
        fishList.add(new Fish(35, "比目鱼", Rarity.UNCOMMON, 70.0, "海洋鱼类，肉质细腻，价值较高。"));
        fishList.add(new Fish(36, "鳕鱼", Rarity.UNCOMMON, 60.0, "冷水鱼类，肉质厚实，价值中等。"));
        fishList.add(new Fish(37, "鲑鱼", Rarity.UNCOMMON, 120.0, "高档鱼类，适合高级市场。"));
        fishList.add(new Fish(38, "金枪鱼", Rarity.UNCOMMON, 150.0, "大型海洋鱼，深受市场欢迎。"));
        fishList.add(new Fish(39, "带鱼", Rarity.UNCOMMON, 55.0, "细长海鱼，适合烹饪。"));
        fishList.add(new Fish(40, "鲷鱼", Rarity.UNCOMMON, 65.0, "海洋鱼类，肉质鲜嫩。"));
        fishList.add(new Fish(41, "石斑鱼", Rarity.UNCOMMON, 80.0, "热带海鱼，价值较高。"));
        fishList.add(new Fish(42, "鲳鱼", Rarity.UNCOMMON, 60.0, "扁平海鱼，市场需求稳定。"));
        fishList.add(new Fish(43, "秋刀鱼", Rarity.UNCOMMON, 50.0, "小型海鱼，适合烧烤。"));
        fishList.add(new Fish(44, "鲽鱼", Rarity.UNCOMMON, 70.0, "底栖海鱼，肉质细腻。"));
        fishList.add(new Fish(45, "鲅鱼", Rarity.UNCOMMON, 55.0, "掠食性海鱼，价值中等。"));
        fishList.add(new Fish(46, "鳐鱼", Rarity.UNCOMMON, 65.0, "扁平海鱼，皮革可用于工艺。"));
        fishList.add(new Fish(47, "马鲛鱼", Rarity.UNCOMMON, 75.0, "大型海鱼，肉质鲜美。"));
        fishList.add(new Fish(48, "鳒鱼", Rarity.UNCOMMON, 50.0, "小型海鱼，适合批量出售。"));
        fishList.add(new Fish(49, "鲟鱼", Rarity.UNCOMMON, 180.0, "高档鱼类，鱼子酱原料。"));
        fishList.add(new Fish(50, "鲦鱼", Rarity.UNCOMMON, 40.0, "小型淡水鱼，成群出现。"));
        fishList.add(new Fish(51, "鳜鱼", Rarity.UNCOMMON, 90.0, "淡水掠食鱼，肉质鲜美。"));
        fishList.add(new Fish(52, "黄花鱼", Rarity.UNCOMMON, 70.0, "沿海鱼类，市场需求高。"));
        fishList.add(new Fish(53, "鲷鱼", Rarity.UNCOMMON, 65.0, "海洋鱼类，适合高级烹饪。"));
        fishList.add(new Fish(54, "鲽鱼", Rarity.UNCOMMON, 60.0, "底栖鱼类，价值中等。"));
        fishList.add(new Fish(55, "鲚鱼", Rarity.UNCOMMON, 50.0, "小型淡水鱼，适合加工。"));
        fishList.add(new Fish(56, "白鲳", Rarity.UNCOMMON, 65.0, "海洋鱼类，肉质细腻。"));
        fishList.add(new Fish(57, "黑鲷", Rarity.UNCOMMON, 70.0, "海洋鱼类，价值稳定。"));
        fishList.add(new Fish(58, "鲼鱼", Rarity.UNCOMMON, 60.0, "大型扁平鱼，皮革价值高。"));
        fishList.add(new Fish(59, "鲋鱼", Rarity.UNCOMMON, 45.0, "淡水鱼，适合新手捕获。"));
        fishList.add(new Fish(60, "鲤鱼王", Rarity.UNCOMMON, 100.0, "大型鲤鱼，体型惊人，价值较高。"));

        // 蓝色（稀有） - 珍稀现实鱼类，30种
        fishList.add(new Fish(61, "红龙鱼", Rarity.RARE, 300.0, "稀有观赏鱼，象征好运，收藏价值高。"));
        fishList.add(new Fish(62, "电鳗", Rarity.RARE, 350.0, "稀有鱼类，可用于特殊合成。"));
        fishList.add(new Fish(63, "狮子鱼", Rarity.RARE, 250.0, "稀有热带鱼，美丽但有毒。"));
        fishList.add(new Fish(64, "鹦鹉鱼", Rarity.RARE, 280.0, "稀有珊瑚鱼，色彩艳丽。"));
        fishList.add(new Fish(65, "彩虹鳟鱼", Rarity.RARE, 270.0, "稀有鱼类，鳞片闪耀七彩光芒。"));
        fishList.add(new Fish(66, "蓝鳍金枪鱼", Rarity.RARE, 400.0, "顶级海洋鱼，肉质极佳。"));
        fishList.add(new Fish(67, "海鳝", Rarity.RARE, 260.0, "细长掠食鱼，深海珍品。"));
        fishList.add(new Fish(68, "神仙鱼", Rarity.RARE, 290.0, "热带观赏鱼，形态优雅。"));
        fishList.add(new Fish(69, "射水鱼", Rarity.RARE, 270.0, "能喷水攻击昆虫，稀有热带鱼。"));
        fishList.add(new Fish(70, "翻车鱼", Rarity.RARE, 350.0, "巨型海洋鱼，体型奇特。"));
        fishList.add(new Fish(71, "石首鱼", Rarity.RARE, 280.0, "稀有鱼类，可发出声音。"));
        fishList.add(new Fish(72, "海龙", Rarity.RARE, 300.0, "小型稀有鱼，形似海马。"));
        fishList.add(new Fish(73, "海马", Rarity.RARE, 250.0, "稀有海洋生物，行动缓慢。"));
        fishList.add(new Fish(74, "隆头鱼", Rarity.RARE, 270.0, "热带鱼类，头部独特。"));
        fishList.add(new Fish(75, "海天使", Rarity.RARE, 260.0, "小型透明鱼，深海珍品。"));
        fishList.add(new Fish(76, "蓝环章鱼", Rarity.RARE, 320.0, "稀有有毒海洋生物，色彩鲜艳。"));
        fishList.add(new Fish(77, "水母", Rarity.RARE, 250.0, "漂浮海洋生物，触手危险。"));
        fishList.add(new Fish(78, "龙虾", Rarity.RARE, 300.0, "珍稀海鲜，肉质鲜美。"));
        fishList.add(new Fish(79, "帝王蟹", Rarity.RARE, 350.0, "巨型螃蟹，价值极高。"));
        fishList.add(new Fish(80, "珍珠贝", Rarity.RARE, 280.0, "可能含有珍珠，稀有贝类。"));
        fishList.add(new Fish(81, "大白鲨", Rarity.RARE, 400.0, "顶级掠食者，极难捕获。"));
        fishList.add(new Fish(82, "旗鱼", Rarity.RARE, 380.0, "高速海洋鱼，剑状喙。"));
        fishList.add(new Fish(83, "海豚鱼", Rarity.RARE, 360.0, "热带鱼类，色彩鲜艳。"));
        fishList.add(new Fish(84, "鲸鲨", Rarity.RARE, 450.0, "温和巨型鱼，价值极高。"));
        fishList.add(new Fish(85, "鮟鱇鱼", Rarity.RARE, 300.0, "深海鱼类，头灯诱捕猎物。"));
        fishList.add(new Fish(86, "银鲳", Rarity.RARE, 280.0, "稀有海鱼，肉质细腻。"));
        fishList.add(new Fish(87, "红鲷", Rarity.RARE, 290.0, "珍稀海鱼，适合高级烹饪。"));
        fishList.add(new Fish(88, "斑节虾", Rarity.RARE, 270.0, "稀有虾类，市场需求高。"));
        fishList.add(new Fish(89, "三文鱼", Rarity.RARE, 320.0, "高档鱼类，肉质鲜美。"));
        fishList.add(new Fish(90, "大黄鱼", Rarity.RARE, 300.0, "珍稀黄鱼，价值极高。"));

        // 紫色（史诗） - 珍稀物种，20种
        fishList.add(new Fish(91, "碧玉鲨", Rarity.EPIC, 1000.0, "史诗鱼类，拥有翡翠般鳞片，极难捕获。"));
        fishList.add(new Fish(92, "星光鲷", Rarity.EPIC, 1100.0, "史诗鱼类，鳞片如星光闪烁。"));
        fishList.add(new Fish(93, "月影鳗", Rarity.EPIC, 1050.0, "史诗鱼类，仅在月圆之夜出现。"));
        fishList.add(new Fish(94, "深渊鮟鱇", Rarity.EPIC, 1200.0, "深海史诗鱼，头灯如鬼火。"));
        fishList.add(new Fish(95, "水晶章鱼", Rarity.EPIC, 1150.0, "史诗章鱼，触手晶莹剔透。"));
        fishList.add(new Fish(96, "珊瑚龙", Rarity.EPIC, 1100.0, "史诗鱼类，形似龙形珊瑚。"));
        fishList.add(new Fish(97, "焰尾鱼", Rarity.EPIC, 1000.0, "史诗鱼类，尾部如火焰般闪耀。"));
        fishList.add(new Fish(98, "冰霜鳕", Rarity.EPIC, 1050.0, "史诗鱼类，生活在极寒海域。"));
        fishList.add(new Fish(99, "雷电鳗", Rarity.EPIC, 1150.0, "史诗鱼类，释放微弱电击。"));
        fishList.add(new Fish(100, "珍珠鲸", Rarity.EPIC, 1200.0, "史诗小型鲸，体内藏珍珠。"));
        fishList.add(new Fish(101, "幽光鱼", Rarity.EPIC, 1000.0, "史诗鱼类，身体发出幽光。"));
        fishList.add(new Fish(102, "紫晶鱼", Rarity.EPIC, 1100.0, "史诗鱼类，鳞片如紫水晶。"));
        fishList.add(new Fish(103, "风暴鲨", Rarity.EPIC, 1150.0, "史诗鲨鱼，风暴中出没。"));
        fishList.add(new Fish(104, "海妖之泪", Rarity.EPIC, 1200.0, "史诗贝类，传说为海妖泪水凝结。"));
        fishList.add(new Fish(105, "彩虹水母", Rarity.EPIC, 1050.0, "史诗水母，触手如彩虹。"));
        fishList.add(new Fish(106, "龙骨鱼", Rarity.EPIC, 1100.0, "史诗鱼类，骨骼坚硬如龙骨。"));
        fishList.add(new Fish(107, "星辉鳗", Rarity.EPIC, 1150.0, "史诗鳗鱼，身体如星光流动。"));
        fishList.add(new Fish(108, "深海巨蟹", Rarity.EPIC, 1200.0, "史诗螃蟹，甲壳坚不可摧。"));
        fishList.add(new Fish(109, "寒冰龙虾", Rarity.EPIC, 1050.0, "史诗龙虾，生活在冰冷海域。"));
        fishList.add(new Fish(110, "琥珀鱼", Rarity.EPIC, 1100.0, "史诗鱼类，鳞片如琥珀般透明。"));

        // 橙色（传说） - 虚拟生物，7种
        fishList.add(new Fish(111, "幻影金枪鱼", Rarity.LEGENDARY, 2500.0, "传说鱼类，身体如幻影般透明。"));
        fishList.add(new Fish(112, "虚空鲸", Rarity.LEGENDARY, 3000.0, "传说鱼类，游弋于深海虚空。"));
        fishList.add(new Fish(113, "星辰海龙", Rarity.LEGENDARY, 2800.0, "传说生物，鳞片如星辰闪烁。"));
        fishList.add(new Fish(114, "深渊巨兽", Rarity.LEGENDARY, 3200.0, "传说鱼类，深海霸主，体型巨大。"));
        fishList.add(new Fish(115, "海神之子", Rarity.LEGENDARY, 2700.0, "传说鱼类，传说为海神后裔。"));
        fishList.add(new Fish(116, "暗影鳗", Rarity.LEGENDARY, 2600.0, "传说鱼类，隐藏在黑暗海域。"));
        fishList.add(new Fish(117, "炎龙鱼", Rarity.LEGENDARY, 2900.0, "传说鱼类，尾部如火焰燃烧。"));

        // 彩色（至臻传说） - 终极虚拟生物，3种
        fishList.add(new Fish(118, "星河之灵", Rarity.MYTHIC, 5000.0, "至臻传说鱼类，身体如银河流动，仅在星空下出现。"));
        fishList.add(new Fish(119, "虚空海皇", Rarity.MYTHIC, 5500.0, "至臻传说生物，掌控空间之力，极其罕见。"));
        fishList.add(new Fish(120, "永恒水龙", Rarity.MYTHIC, 6000.0, "至臻传说龙鱼，传说为海洋之神化身。"));
    }
}
