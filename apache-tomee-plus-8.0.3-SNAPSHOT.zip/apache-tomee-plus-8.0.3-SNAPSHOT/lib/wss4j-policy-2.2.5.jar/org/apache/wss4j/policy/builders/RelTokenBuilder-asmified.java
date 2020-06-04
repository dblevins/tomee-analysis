package asm.org.apache.wss4j.policy.builders;
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
public class RelTokenBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/policy/builders/RelTokenBuilder", "Ljava/lang/Object;Lorg/apache/neethi/builders/AssertionBuilder<Lorg/w3c/dom/Element;>;", "java/lang/Object", new String[] { "org/apache/neethi/builders/AssertionBuilder" });

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$SPVersion", "org/apache/wss4j/policy/SPConstants", "SPVersion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$IncludeTokenType", "org/apache/wss4j/policy/SPConstants", "IncludeTokenType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "(Lorg/w3c/dom/Element;Lorg/apache/neethi/AssertionBuilderFactory;)Lorg/apache/neethi/Assertion;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPConstants$SPVersion", "getSPVersion", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/SPConstants$SPVersion;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants$SPVersion", "getSPConstants", "()Lorg/apache/wss4j/policy/SPConstants;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants", "getIncludeToken", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants$SPVersion", "getSPConstants", "()Lorg/apache/wss4j/policy/SPConstants;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants", "getIssuer", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "getFirstChildElement", "(Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$SPVersion", "SP11", "Lorg/apache/wss4j/policy/SPConstants$SPVersion;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid Policy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/wss4j/policy/SPConstants$SPVersion", "java/lang/String", "org/w3c/dom/Element"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants$SPVersion", "getSPConstants", "()Lorg/apache/wss4j/policy/SPConstants;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants", "getIssuerName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "getFirstChildElementText", "(Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$SPVersion", "SP11", "Lorg/apache/wss4j/policy/SPConstants$SPVersion;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid Policy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "getFirstPolicyChildElement", "(Lorg/w3c/dom/Element;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants$SPVersion", "getSPConstants", "()Lorg/apache/wss4j/policy/SPConstants;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants", "getClaims", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "getFirstChildElement", "(Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/AssertionBuilderFactory", "getPolicyEngine", "()Lorg/apache/neethi/PolicyBuilder;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicy", "(Lorg/w3c/dom/Element;)Lorg/apache/neethi/Policy;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/w3c/dom/Element", "org/w3c/dom/Element"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/neethi/Policy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/Policy", "<init>", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/neethi/Policy"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/RelToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants$SPVersion", "getSPConstants", "()Lorg/apache/wss4j/policy/SPConstants;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants", "getInclusionFromAttributeValue", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/RelToken", "<init>", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;Lorg/w3c/dom/Element;Ljava/lang/String;Lorg/w3c/dom/Element;Lorg/apache/neethi/Policy;)V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "isOptional", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/RelToken", "setOptional", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "isIgnorable", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/RelToken", "setIgnorable", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKnownElements", "()[Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP13Constants", "REL_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP11Constants", "REL_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "build", "(Ljava/lang/Object;Lorg/apache/neethi/AssertionBuilderFactory;)Lorg/apache/neethi/Assertion;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/builders/RelTokenBuilder", "build", "(Lorg/w3c/dom/Element;Lorg/apache/neethi/AssertionBuilderFactory;)Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
