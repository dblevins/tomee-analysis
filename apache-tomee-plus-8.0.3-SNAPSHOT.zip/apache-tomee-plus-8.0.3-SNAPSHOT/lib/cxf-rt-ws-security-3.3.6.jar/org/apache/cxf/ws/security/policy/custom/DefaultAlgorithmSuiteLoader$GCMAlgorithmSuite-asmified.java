package asm.org.apache.cxf.ws.security.policy.custom;
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
public class DefaultAlgorithmSuiteLoader$GCMAlgorithmSuiteDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", null, "org/apache/wss4j/policy/model/AlgorithmSuite", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$SPVersion", "org/apache/wss4j/policy/SPConstants", "SPVersion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader", "GCMAlgorithmSuite", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "org/apache/wss4j/policy/model/AlgorithmSuite", "AlgorithmSuiteType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/neethi/Policy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite", "<init>", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/neethi/Policy;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "cloneAssertion", "(Lorg/apache/neethi/Policy;)Lorg/apache/wss4j/policy/model/AbstractSecurityAssertion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "getVersion", "()Lorg/apache/wss4j/policy/SPConstants$SPVersion;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "<init>", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/neethi/Policy;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "parseCustomAssertion", "(Lorg/apache/neethi/Assertion;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn("http://cxf.apache.org/custom/security-policy");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("Basic128GCM");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "ALGORITHM_SUITE_TYPES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("Basic128GCM");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "setAlgorithmSuiteType", "(Lorg/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "getAlgorithmSuiteType", "()Lorg/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "setNamespace", "(Ljava/lang/String;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Basic192GCM");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "ALGORITHM_SUITE_TYPES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("Basic192GCM");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "setAlgorithmSuiteType", "(Lorg/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "getAlgorithmSuiteType", "()Lorg/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "setNamespace", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Basic256GCM");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "ALGORITHM_SUITE_TYPES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("Basic256GCM");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "setAlgorithmSuiteType", "(Lorg/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "getAlgorithmSuiteType", "()Lorg/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "setNamespace", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "ALGORITHM_SUITE_TYPES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("Basic128GCM");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Basic128GCM");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#sha1");
methodVisitor.visitLdcInsn("http://www.w3.org/2009/xmlenc11#aes128-gcm");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#kw-aes128");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "ALGORITHM_SUITE_TYPES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("Basic192GCM");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Basic192GCM");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#sha1");
methodVisitor.visitLdcInsn("http://www.w3.org/2009/xmlenc11#aes192-gcm");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#kw-aes192");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/custom/DefaultAlgorithmSuiteLoader$GCMAlgorithmSuite", "ALGORITHM_SUITE_TYPES", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("Basic256GCM");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Basic256GCM");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#sha1");
methodVisitor.visitLdcInsn("http://www.w3.org/2009/xmlenc11#aes256-gcm");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#kw-aes256");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite$AlgorithmSuiteType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(17, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
