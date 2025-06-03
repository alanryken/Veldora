package com.unnng.veldora.hunting.data.local;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.hunting.entity.Hunt;

import java.util.ArrayList;
import java.util.List;

public class HuntResources {
    public static List<Hunt> huntList = new ArrayList<>();

    static {

        // COMMON（普通） - 废弃物和低价值猎物，30种
        huntList.add(new Hunt(1, "破损的骨头", Rarity.COMMON, 2.0, "折断的动物骨头，毫无价值。"));
        huntList.add(new Hunt(2, "腐烂的皮革", Rarity.COMMON, 1.5, "腐坏的动物皮，散发恶臭。"));
        huntList.add(new Hunt(3, "断裂的羽毛", Rarity.COMMON, 1.0, "鸟类掉落的破损羽毛，无用。"));
        huntList.add(new Hunt(4, "干瘪的爪子", Rarity.COMMON, 1.5, "小型动物的干枯爪子，无人问津。"));
        huntList.add(new Hunt(5, "碎角", Rarity.COMMON, 2.0, "破碎的鹿角碎片，价值低。"));
        huntList.add(new Hunt(6, "烂肉", Rarity.COMMON, 1.0, "变质的肉块，无法食用。"));
        huntList.add(new Hunt(7, "虫蛀的毛皮", Rarity.COMMON, 1.5, "被虫蛀蚀的毛皮，毫无用途。"));
        huntList.add(new Hunt(8, "破损的鸟喙", Rarity.COMMON, 1.0, "破裂的鸟喙，常见废弃物。"));
        huntList.add(new Hunt(9, "腐臭的内脏", Rarity.COMMON, 1.0, "腐烂的动物内脏，无用。"));
        huntList.add(new Hunt(10, "断裂的牙齿", Rarity.COMMON, 1.5, "小型动物的断牙，价值低。"));
        huntList.add(new Hunt(11, "兔皮", Rarity.COMMON, 20.0, "柔软的兔子皮毛，用于小型工艺品。"));
        huntList.add(new Hunt(12, "野鸡羽", Rarity.COMMON, 15.0, "常见野鸡羽毛，用于装饰。"));
        huntList.add(new Hunt(13, "松鼠尾", Rarity.COMMON, 10.0, "松鼠的尾巴毛，适合装饰。"));
        huntList.add(new Hunt(14, "野兔肉", Rarity.COMMON, 18.0, "小型猎物的肉，适合烹饪。"));
        huntList.add(new Hunt(15, "麻雀羽", Rarity.COMMON, 12.0, "普通鸟类的羽毛，价值一般。"));
        huntList.add(new Hunt(16, "老鼠皮", Rarity.COMMON, 10.0, "小型啮齿动物的皮，价值低。"));
        huntList.add(new Hunt(17, "野鸭羽", Rarity.COMMON, 15.0, "野鸭的羽毛，适合工艺品。"));
        huntList.add(new Hunt(18, "獾皮", Rarity.COMMON, 20.0, "小型哺乳动物的皮，价值一般。"));
        huntList.add(new Hunt(19, "野鸡肉", Rarity.COMMON, 18.0, "野鸡的肉，味道普通。"));
        huntList.add(new Hunt(20, "田鼠肉", Rarity.COMMON, 12.0, "小型啮齿动物的肉，价值低。"));
        huntList.add(new Hunt(21, "乌鸦羽", Rarity.COMMON, 10.0, "乌鸦的黑色羽毛，价值一般。"));
        huntList.add(new Hunt(22, "野兔骨", Rarity.COMMON, 8.0, "兔子的骨头，适合制作工具。"));
        huntList.add(new Hunt(23, "鹌鹑蛋", Rarity.COMMON, 15.0, "小型鸟蛋，适合烹饪。"));
        huntList.add(new Hunt(24, "鼹鼠皮", Rarity.COMMON, 12.0, "鼹鼠的皮，柔软但价值低。"));
        huntList.add(new Hunt(25, "野鸽羽", Rarity.COMMON, 10.0, "野鸽的羽毛，常见装饰品。"));
        huntList.add(new Hunt(26, "兔爪", Rarity.COMMON, 12.0, "兔子的爪子，略有价值。"));
        huntList.add(new Hunt(27, "野鼠尾", Rarity.COMMON, 8.0, "小型啮齿动物的尾巴，无用。"));
        huntList.add(new Hunt(28, "麻雀蛋", Rarity.COMMON, 10.0, "小型鸟蛋，价值普通。"));
        huntList.add(new Hunt(29, "松鼠皮", Rarity.COMMON, 15.0, "松鼠的毛皮，适合小型工艺。"));
        huntList.add(new Hunt(30, "野鸭肉", Rarity.COMMON, 18.0, "野鸭的肉，适合烹饪。"));

        // UNCOMMON（优秀） - 常见现实猎物，30种
        huntList.add(new Hunt(31, "鹿肉", Rarity.UNCOMMON, 50.0, "常见猎物，肉质鲜美，市场需求高。"));
        huntList.add(new Hunt(32, "野猪皮", Rarity.UNCOMMON, 70.0, "坚韧的皮革，用于装备制作。"));
        huntList.add(new Hunt(33, "狼牙", Rarity.UNCOMMON, 60.0, "象征勇气的狼牙，用于仪式。"));
        huntList.add(new Hunt(34, "狐狸皮", Rarity.UNCOMMON, 80.0, "柔软的狐狸毛皮，市场需求稳定。"));
        huntList.add(new Hunt(35, "山羊角", Rarity.UNCOMMON, 60.0, "用于乐器或药材，价值中等。"));
        huntList.add(new Hunt(36, "豪猪刺", Rarity.UNCOMMON, 50.0, "尖锐的刺，用于防御装备。"));
        huntList.add(new Hunt(37, "麋鹿角", Rarity.UNCOMMON, 150.0, "高档猎物，用于药材和装饰。"));
        huntList.add(new Hunt(38, "牦牛毛", Rarity.UNCOMMON, 120.0, "保暖材料，适合制作衣物。"));
        huntList.add(new Hunt(39, "野猪肉", Rarity.UNCOMMON, 70.0, "肥美的野猪肉，适合烹饪。"));
        huntList.add(new Hunt(40, "狼皮", Rarity.UNCOMMON, 80.0, "坚韧的狼皮，用于装备。"));
        huntList.add(new Hunt(41, "鹿皮", Rarity.UNCOMMON, 60.0, "柔软的鹿皮，适合工艺品。"));
        huntList.add(new Hunt(42, "山鸡羽", Rarity.UNCOMMON, 50.0, "色彩鲜艳的羽毛，用于装饰。"));
        huntList.add(new Hunt(43, "野羊毛", Rarity.UNCOMMON, 70.0, "保暖的羊毛，适合纺织。"));
        huntList.add(new Hunt(44, "獐子肉", Rarity.UNCOMMON, 60.0, "小型鹿科动物的肉，味道鲜美。"));
        huntList.add(new Hunt(45, "狐狸尾", Rarity.UNCOMMON, 80.0, "狐狸的尾巴毛，装饰价值高。"));
        huntList.add(new Hunt(46, "野猪牙", Rarity.UNCOMMON, 50.0, "坚硬的野猪牙，用于工艺。"));
        huntList.add(new Hunt(47, "山猫皮", Rarity.UNCOMMON, 70.0, "柔软的猫科动物皮，价值中等。"));
        huntList.add(new Hunt(48, "野鹿角", Rarity.UNCOMMON, 60.0, "小型鹿角，适合雕刻。"));
        huntList.add(new Hunt(49, "野鹅羽", Rarity.UNCOMMON, 50.0, "野鹅的羽毛，用于箭矢。"));
        huntList.add(new Hunt(50, "獾肉", Rarity.UNCOMMON, 60.0, "獾的肉，味道独特。"));
        huntList.add(new Hunt(51, "野牛皮", Rarity.UNCOMMON, 80.0, "坚韧的野牛皮，适合重型装备。"));
        huntList.add(new Hunt(52, "野兔毛", Rarity.UNCOMMON, 50.0, "柔软的兔毛，适合纺织。"));
        huntList.add(new Hunt(53, "野猪蹄", Rarity.UNCOMMON, 60.0, "野猪的蹄子，可用于药材。"));
        huntList.add(new Hunt(54, "狼爪", Rarity.UNCOMMON, 70.0, "锋利的狼爪，适合工艺品。"));
        huntList.add(new Hunt(55, "野鸡蛋", Rarity.UNCOMMON, 50.0, "野鸡的蛋，适合烹饪。"));
        huntList.add(new Hunt(56, "山羊肉", Rarity.UNCOMMON, 60.0, "山羊的肉，味道浓郁。"));
        huntList.add(new Hunt(57, "狐狸爪", Rarity.UNCOMMON, 70.0, "狐狸的爪子，装饰价值高。"));
        huntList.add(new Hunt(58, "野牛角", Rarity.UNCOMMON, 80.0, "坚硬的野牛角，用于乐器。"));
        huntList.add(new Hunt(59, "野鹅肉", Rarity.UNCOMMON, 60.0, "野鹅的肉，适合烧烤。"));
        huntList.add(new Hunt(60, "獐子皮", Rarity.UNCOMMON, 70.0, "小型鹿科动物的皮，价值中等。"));

        // RARE（稀有） - 珍稀现实猎物，30种
        huntList.add(new Hunt(61, "雪豹皮", Rarity.RARE, 300.0, "稀有猎物，毛皮华丽，深受贵族喜爱。"));
        huntList.add(new Hunt(62, "黑豹爪", Rarity.RARE, 350.0, "锋利无比的爪子，价值极高。"));
        huntList.add(new Hunt(63, "猛犸象牙", Rarity.RARE, 400.0, "巨大且珍贵的象牙，用于雕刻。"));
        huntList.add(new Hunt(64, "火隼羽", Rarity.RARE, 280.0, "炽热的羽毛，市场需求高。"));
        huntList.add(new Hunt(65, "白虎皮", Rarity.RARE, 320.0, "象征力量的虎皮，价值极高。"));
        huntList.add(new Hunt(66, "熊掌", Rarity.RARE, 350.0, "珍稀食材，出售价值高。"));
        huntList.add(new Hunt(67, "狮子鬃毛", Rarity.RARE, 300.0, "雄狮的鬃毛，象征威严。"));
        huntList.add(new Hunt(68, "犀牛角", Rarity.RARE, 400.0, "稀有药材，价值极高。"));
        huntList.add(new Hunt(69, "猎豹皮", Rarity.RARE, 320.0, "柔软且华丽的皮毛，市场需求高。"));
        huntList.add(new Hunt(70, "大雕羽", Rarity.RARE, 280.0, "巨型猛禽的羽毛，用于高级箭矢。"));
        huntList.add(new Hunt(71, "野牛肉", Rarity.RARE, 300.0, "肥美的野牛肉，高级食材。"));
        huntList.add(new Hunt(72, "麝香", Rarity.RARE, 350.0, "麝鹿分泌物，用于香料。"));
        huntList.add(new Hunt(73, "豹尾", Rarity.RARE, 320.0, "豹子的尾巴，装饰价值高。"));
        huntList.add(new Hunt(74, "牦牛肉", Rarity.RARE, 300.0, "牦牛的肉，适合高寒烹饪。"));
        huntList.add(new Hunt(75, "孔雀羽", Rarity.RARE, 280.0, "色彩艳丽的羽毛，高级装饰品。"));
        huntList.add(new Hunt(76, "黑熊皮", Rarity.RARE, 320.0, "厚实的熊皮，适合重型装备。"));
        huntList.add(new Hunt(77, "羚羊角", Rarity.RARE, 300.0, "优雅的羚羊角，用于工艺。"));
        huntList.add(new Hunt(78, "狮子爪", Rarity.RARE, 350.0, "锋利的狮爪，价值极高。"));
        huntList.add(new Hunt(79, "野马鬃", Rarity.RARE, 280.0, "野马的鬃毛，用于编织。"));
        huntList.add(new Hunt(80, "棕熊肉", Rarity.RARE, 300.0, "棕熊的肉，味道浓郁。"));
        huntList.add(new Hunt(81, "猞猁皮", Rarity.RARE, 320.0, "稀有猫科动物的皮，柔软华丽。"));
        huntList.add(new Hunt(82, "角鹰羽", Rarity.RARE, 280.0, "稀有猛禽的羽毛，适合箭矢。"));
        huntList.add(new Hunt(83, "水牛角", Rarity.RARE, 300.0, "坚硬的水牛角，用于乐器。"));
        huntList.add(new Hunt(84, "豹子肉", Rarity.RARE, 320.0, "豹子的肉，高级食材。"));
        huntList.add(new Hunt(85, "麋鹿肉", Rarity.RARE, 300.0, "麋鹿的肉，味道鲜美。"));
        huntList.add(new Hunt(86, "白狼皮", Rarity.RARE, 350.0, "稀有白狼的皮，象征纯洁。"));
        huntList.add(new Hunt(87, "猛禽爪", Rarity.RARE, 280.0, "大型猛禽的爪子，工艺价值高。"));
        huntList.add(new Hunt(88, "野马皮", Rarity.RARE, 320.0, "坚韧的马皮，适合装备。"));
        huntList.add(new Hunt(89, "大雁羽", Rarity.RARE, 280.0, "大雁的羽毛，用于高级箭矢。"));
        huntList.add(new Hunt(90, "羚羊肉", Rarity.RARE, 300.0, "羚羊的肉，适合烹饪。"));

        // EPIC（史诗） - 珍稀奇幻猎物，20种
        huntList.add(new Hunt(91, "雷鸟羽", Rarity.EPIC, 1000.0, "史诗猎物，羽毛如闪电般耀眼。"));
        huntList.add(new Hunt(92, "冰霜巨狼牙", Rarity.EPIC, 1100.0, "史诗狼牙，寒气逼人，用于高级装备。"));
        huntList.add(new Hunt(93, "星光雄鹿角", Rarity.EPIC, 1050.0, "史诗鹿角，闪烁星光，价值极高。"));
        huntList.add(new Hunt(94, "火焰豹皮", Rarity.EPIC, 1150.0, "史诗豹皮，散发炽热气息。"));
        huntList.add(new Hunt(95, "幽魂熊掌", Rarity.EPIC, 1000.0, "史诗熊掌，蕴含幽魂之力。"));
        huntList.add(new Hunt(96, "水晶鹰羽", Rarity.EPIC, 1100.0, "史诗鹰羽，如水晶般剔透。"));
        huntList.add(new Hunt(97, "雷霆鹿肉", Rarity.EPIC, 1050.0, "史诗鹿肉，食用后增强力量。"));
        huntList.add(new Hunt(98, "暗影狼皮", Rarity.EPIC, 1150.0, "史诗狼皮，融入黑暗之力。"));
        huntList.add(new Hunt(99, "星辉豹爪", Rarity.EPIC, 1000.0, "史诗豹爪，闪烁星光。"));
        huntList.add(new Hunt(100, "冰霜犀角", Rarity.EPIC, 1100.0, "史诗犀角，寒冰之力凝结。"));
        huntList.add(new Hunt(101, "烈焰雄狮鬃", Rarity.EPIC, 1050.0, "史诗狮鬃，似火焰般燃烧。"));
        huntList.add(new Hunt(102, "紫晶鹿皮", Rarity.EPIC, 1150.0, "史诗鹿皮，如紫水晶般闪耀。"));
        huntList.add(new Hunt(103, "风暴鹰爪", Rarity.EPIC, 1000.0, "史诗鹰爪，风暴中捕获。"));
        huntList.add(new Hunt(104, "灵光虎牙", Rarity.EPIC, 1100.0, "史诗虎牙，散发灵性光芒。"));
        huntList.add(new Hunt(105, "寒霜熊皮", Rarity.EPIC, 1050.0, "史诗熊皮，生长于极寒之地。"));
        huntList.add(new Hunt(106, "星辰野牛角", Rarity.EPIC, 1150.0, "史诗野牛角，蕴含星辰之力。"));
        huntList.add(new Hunt(107, "夜影豹尾", Rarity.EPIC, 1000.0, "史诗豹尾，融入夜色。"));
        huntList.add(new Hunt(108, "雷电雕羽", Rarity.EPIC, 1100.0, "史诗雕羽，带电光闪烁。"));
        huntList.add(new Hunt(109, "琥珀狼毛", Rarity.EPIC, 1050.0, "史诗狼毛，如琥珀般透明。"));
        huntList.add(new Hunt(110, "烈焰羚角", Rarity.EPIC, 1150.0, "史诗羚角，散发炽热能量。"));

        // LEGENDARY（传说） - 虚拟生物，7种
        huntList.add(new Hunt(111, "幻影独角兽", Rarity.LEGENDARY, 2800.0, "传说猎物，角蕴含魔法，狩猎难度极高。"));
        huntList.add(new Hunt(112, "虚空龙鳞", Rarity.LEGENDARY, 3000.0, "传说龙鳞，坚不可摧，极其罕见。"));
        huntList.add(new Hunt(113, "星辰狮鬃", Rarity.LEGENDARY, 2600.0, "传说狮鬃，闪烁星光，象征王者。"));
        huntList.add(new Hunt(114, "暗影凤凰羽", Rarity.LEGENDARY, 2900.0, "传说凤凰羽，散发黑暗火焰。"));
        huntList.add(new Hunt(115, "雷霆巨龙爪", Rarity.LEGENDARY, 2700.0, "传说龙爪，蕴含雷电之力。"));
        huntList.add(new Hunt(116, "虚空麒麟角", Rarity.LEGENDARY, 2800.0, "传说麒麟角，掌控空间之力。"));
        huntList.add(new Hunt(117, "炎龙之牙", Rarity.LEGENDARY, 2900.0, "传说龙牙，炽热无比。"));

        // MYTHIC（神话） - 终极虚拟生物，3种
        huntList.add(new Hunt(118, "星河之翼", Rarity.MYTHIC, 5000.0, "神话猎物，巨鸟羽翼如银河流动。"));
        huntList.add(new Hunt(119, "永恒龙骨", Rarity.MYTHIC, 5500.0, "神话龙骨，蕴含永恒之力。"));
        huntList.add(new Hunt(120, "虚空神兽皮", Rarity.MYTHIC, 6000.0, "神话猎物，皮革掌控空间之力。"));
    }
}
