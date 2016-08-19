package org.frice.game.obj.button

import org.frice.game.obj.AbstractObject
import org.frice.game.resource.graphics.ColorResource

/**
 * Created by ice1000 on 2016/8/19.
 *
 * @author ice1000
 * @since v0.4
 */
interface FText : AbstractObject {
	var text: String

	fun getColor(): ColorResource
}