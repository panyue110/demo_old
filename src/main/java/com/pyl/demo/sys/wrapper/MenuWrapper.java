/**

 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pyl.demo.sys.wrapper;

import com.pyl.demo.sys.dao.entity.SysMenu;
import com.pyl.demo.sys.service.SysMenuService;
import com.pyl.demo.sys.vo.SysMenuVO;
import org.springblade.core.tool.node.ForestNodeMerger;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.Func;
import org.springblade.core.tool.utils.SpringUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class MenuWrapper  {

	private static SysMenuService menuService;


	static {
		menuService = SpringUtil.getBean(SysMenuService.class);
	}

	public static MenuWrapper build() {
		return new MenuWrapper();
	}



	public SysMenuVO entityVO(SysMenu sysMenu) {
		SysMenuVO sysMenuVO = BeanUtil.copy(sysMenu, SysMenuVO.class);
		return sysMenuVO;
	}

}