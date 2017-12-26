public class Auxi$className$Page implements AuxiPort, AuxiPost, CoreFree {
	private CoreActivity main;
	private FixCoreView core;

	@Override
	public View onLoad(Object handle, int width, int height, JsonModal data) {
		AuxiModal modal = new AuxiModal(handle);
		main = modal.getMain();
		View view = modal.getScaledLayout(R.layout.$res$);
		core = new FixCoreView(main);
		core.setAgency(this);
		core.addView(view);
		initView();
		return core;
	}

	private void initView() {
		
	}

	@Override
	public void onMessage(View view, String data, String target) {
		if (TextUtils.equals(target, FixCoreView.MSG_LOADED)) {
			
		}
	}

	@Override
	public void destroy() {
		main = null;
	}
}