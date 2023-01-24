package com.twaun95.presentation.dialog

import androidx.fragment.app.FragmentManager
import com.twaun95.presentation.R
import com.twaun95.presentation.base.BaseDialog
import com.twaun95.presentation.databinding.DialogCommonBinding
import com.twaun95.presentation.extensions.visible

class CommonDialog(
    private val buttonType: ButtonType,
    private val content: String,
    private var onDismissListener: (()->Unit)? = null,
    private var onCancelListener : (()->Unit)? = null,
    private var onConfirmListener : (()->Unit)? = null
) : BaseDialog<DialogCommonBinding>(R.layout.dialog_common){
    override fun initView() {
        super.initView()

        when(buttonType) {
            ButtonType.ONE -> {
                binding.layoutBottomTypeOne.visible()
            }
            ButtonType.TWO -> {
                binding.layoutBottomTypeTwo.visible()
            }
        }

        content.run {
            binding.tvTitle.text = this
//            binding.tvMessage.text = message ?: ""
        }
    }

    override fun setEvent() {
        super.setEvent()

        binding.btnCancelTypeTwo.setOnClickListener {
            onDismissListener?.invoke()
            onCancelListener?.invoke()
            dismiss()
        }
        binding.btnCompleteTypeTwo.setOnClickListener {
            onDismissListener?.invoke()
            onConfirmListener?.invoke()
            dismiss()
        }
        binding.btnCompleteTypeOne.setOnClickListener {
            onDismissListener?.invoke()
            onConfirmListener?.invoke()
            dismiss()
        }
    }

    companion object {
        private const val TAG = "CommonDialog"

        fun show(
            fragmentManager: FragmentManager,
            buttonType: ButtonType,
            content: String,
            onDismissListener: (()->Unit)? = null,
            onCancelListener : (()->Unit)? = null,
            onConfirmListener : (()->Unit)? = null
        ) {
            return CommonDialog(buttonType, content, onDismissListener, onCancelListener, onConfirmListener)
                .show(fragmentManager, TAG)
        }
    }
}