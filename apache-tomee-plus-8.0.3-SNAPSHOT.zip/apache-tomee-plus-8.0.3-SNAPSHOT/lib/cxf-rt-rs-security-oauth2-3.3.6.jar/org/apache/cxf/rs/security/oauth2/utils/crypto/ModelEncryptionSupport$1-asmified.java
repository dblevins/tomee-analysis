package asm.org.apache.cxf.rs.security.oauth2.utils.crypto;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class ModelEncryptionSupport$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/utils/crypto/ModelEncryptionSupport$1", null, "org/apache/cxf/rs/security/oauth2/common/ServerAccessToken", null);

classWriter.visitOuterClass("org/apache/cxf/rs/security/oauth2/utils/crypto/ModelEncryptionSupport", "recreateAccessToken", "(Lorg/apache/cxf/rs/security/oauth2/provider/OAuthDataProvider;Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;");

classWriter.visitInnerClass("org/apache/cxf/rs/security/oauth2/utils/crypto/ModelEncryptionSupport$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;Ljava/lang/String;JJ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/ServerAccessToken", "<init>", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;Ljava/lang/String;JJ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
