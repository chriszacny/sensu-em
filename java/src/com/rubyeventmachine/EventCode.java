package com.rubyeventmachine;

public enum EventCode {
	EM_TIMER_FIRED(100),
	EM_CONNECTION_READ(101),
	EM_CONNECTION_UNBOUND(102),
	EM_CONNECTION_ACCEPTED(103),
	EM_CONNECTION_COMPLETED(104),
	EM_LOOPBREAK_SIGNAL(105),
	EM_CONNECTION_NOTIFY_READABLE(106),
	EM_CONNECTION_NOTIFY_WRITABLE(107),
	EM_SSL_HANDSHAKE_COMPLETED(108),
	EM_SSL_VERIFY(109),
	EM_PROXY_TARGET_UNBOUND(110),
	EM_PROXY_COMPLETED(111);

	private final int intValue;

	EventCode(int intValue) {
		this.intValue = intValue;
	}

	public int intValue() {
		return intValue;
	}
}