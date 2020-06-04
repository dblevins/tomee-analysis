package asm.org.apache.wss4j.common.saml.bean;
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
public class ConditionsBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/common/saml/bean/ConditionsBean", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "notBefore", "Lorg/joda/time/DateTime;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "notAfter", "Lorg/joda/time/DateTime;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tokenPeriodSeconds", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "audienceRestrictions", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/wss4j/common/saml/bean/AudienceRestrictionBean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oneTimeUse", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "delegates", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/wss4j/common/saml/bean/DelegateBean;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/time/Instant;Ljava/time/Instant;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTime", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/wss4j/common/saml/bean/ConditionsBean", "java/time/Instant", "java/time/Instant"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTime", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(60L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNotBefore", "()Lorg/joda/time/DateTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNotBefore", "(Lorg/joda/time/DateTime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNotBefore", "(Ljava/time/Instant;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTime", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNotAfter", "()Lorg/joda/time/DateTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNotAfter", "(Lorg/joda/time/DateTime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNotAfter", "(Ljava/time/Instant;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTime", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenPeriodMinutes", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitLdcInsn(new Long(60L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTokenPeriodMinutes", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(60L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenPeriodSeconds", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTokenPeriodSeconds", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAudienceRestrictions", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/wss4j/common/saml/bean/AudienceRestrictionBean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAudienceRestrictions", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/wss4j/common/saml/bean/AudienceRestrictionBean;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOneTimeUse", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "oneTimeUse", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOneTimeUse", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "oneTimeUse", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProxyRestriction", "()Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProxyRestriction", "(Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegates", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/wss4j/common/saml/bean/DelegateBean;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDelegates", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/wss4j/common/saml/bean/DelegateBean;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/wss4j/common/saml/bean/ConditionsBean");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/saml/bean/ConditionsBean");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/saml/bean/ConditionsBean"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTime", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTime", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "equals", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "oneTimeUse", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "oneTimeUse", "Z");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/bean/ProxyRestrictionBean", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "equals", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "tokenPeriodSeconds", "J");
methodVisitor.visitInsn(L2I);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notBefore", "Lorg/joda/time/DateTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTime", "hashCode", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "notAfter", "Lorg/joda/time/DateTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTime", "hashCode", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "audienceRestrictions", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "hashCode", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "oneTimeUse", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/wss4j/common/saml/bean/ConditionsBean", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "proxyRestriction", "Lorg/apache/wss4j/common/saml/bean/ProxyRestrictionBean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/bean/ProxyRestrictionBean", "hashCode", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/saml/bean/ConditionsBean", "delegates", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "hashCode", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
