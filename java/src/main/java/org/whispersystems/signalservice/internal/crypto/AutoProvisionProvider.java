package org.whispersystems.signalservice.internal.crypto;

import org.whispersystems.curve25519.JavaCurve25519Provider;

/**
 * Created by jlewis on 2/7/18.
 */

public class AutoProvisionProvider extends JavaCurve25519Provider {
  public AutoProvisionProvider() {
    super();
  }

  @Override
  public byte[] generatePublicKey(byte[] privateKey) {
    // XXX This is the only reason for this class. Use in Autoprovisioning.
    return super.generatePublicKey(privateKey);
  }
}
