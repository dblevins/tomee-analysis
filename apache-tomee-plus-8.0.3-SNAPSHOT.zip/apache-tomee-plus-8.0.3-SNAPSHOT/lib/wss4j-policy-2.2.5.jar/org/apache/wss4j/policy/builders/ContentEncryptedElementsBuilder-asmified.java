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
public class ContentEncryptedElementsBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/policy/builders/ContentEncryptedElementsBuilder", null, "org/apache/wss4j/policy/builders/EncryptedElementsBuilder", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$SPVersion", "org/apache/wss4j/policy/SPConstants", "SPVersion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/builders/EncryptedElementsBuilder", "<init>", "()V", false);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/builders/ContentEncryptedElementsBuilder", "getXPathVersion", "(Lorg/w3c/dom/Element;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/builders/ContentEncryptedElementsBuilder", "getXPathExpressions", "(Lorg/w3c/dom/Element;Lorg/apache/wss4j/policy/SPConstants$SPVersion;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/ContentEncryptedElements");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/ContentEncryptedElements", "<init>", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Ljava/lang/String;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "isOptional", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/ContentEncryptedElements", "setOptional", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/policy/SPUtils", "isIgnorable", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/ContentEncryptedElements", "setIgnorable", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKnownElements", "()[Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP13Constants", "CONTENT_ENCRYPTED_ELEMENTS", "Ljavax/xml/namespace/QName;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/builders/ContentEncryptedElementsBuilder", "build", "(Lorg/w3c/dom/Element;Lorg/apache/neethi/AssertionBuilderFactory;)Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
