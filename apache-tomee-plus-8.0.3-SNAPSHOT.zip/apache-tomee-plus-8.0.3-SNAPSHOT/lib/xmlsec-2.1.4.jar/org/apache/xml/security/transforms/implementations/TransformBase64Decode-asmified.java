package asm.org.apache.xml.security.transforms.implementations;
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
public class TransformBase64DecodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", null, "org/apache/xml/security/transforms/TransformSpi", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "implementedTransformURI", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#base64");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/transforms/TransformSpi", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineGetURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#base64");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "enginePerformTransform", "(Lorg/apache/xml/security/signature/XMLSignatureInput;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;", null, new String[] { "java/io/IOException", "org/apache/xml/security/c14n/CanonicalizationException", "org/apache/xml/security/transforms/TransformationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "enginePerformTransform", "(Lorg/apache/xml/security/signature/XMLSignatureInput;Ljava/io/OutputStream;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "enginePerformTransform", "(Lorg/apache/xml/security/signature/XMLSignatureInput;Ljava/io/OutputStream;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;", null, new String[] { "java/io/IOException", "org/apache/xml/security/c14n/CanonicalizationException", "org/apache/xml/security/transforms/TransformationException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/parsers/ParserConfigurationException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/xml/sax/SAXException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "isElement", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "getSubNode", "()Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "getSubNode", "()Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getParentNode", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Node"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "traverseElement", "(Lorg/w3c/dom/Element;Ljava/lang/StringBuilder;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureInput");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureInput", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "secureValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setSecureValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/StringBuilder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "write", "([B)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureInput");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureInput", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "secureValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setSecureValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setOutputStream", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "isOctetStream", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "isNodeSet", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "getBytes", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "decode", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureInput");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureInput", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "secureValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setSecureValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "isByteArray", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNE, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "isNodeSet", "()Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "getBytes", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "decode", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "write", "([B)V", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "getOctetStreamReal", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/JavaUtils", "getBytesFromStream", "(Ljava/io/InputStream;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "decode", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "write", "([B)V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureInput");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureInput", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "secureValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setSecureValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setOutputStream", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "getOctetStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "secureValidation", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "read", "(Ljava/io/InputStream;Z)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "traverseElement", "(Lorg/w3c/dom/Element;Ljava/lang/StringBuilder;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureInput");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureInput", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "secureValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/signature/XMLSignatureInput", "setSecureValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/parsers/ParserConfigurationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/transforms/TransformationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("c14n.Canonicalizer.Exception");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/transforms/TransformationException", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/xml/sax/SAXException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/transforms/TransformationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("SAX exception");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/transforms/TransformationException", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "traverseElement", "(Lorg/w3c/dom/Element;Ljava/lang/StringBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getFirstChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitLookupSwitchInsn(label4, new int[] { 1, 3 }, new Label[] { label2, label3 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/transforms/implementations/TransformBase64Decode", "traverseElement", "(Lorg/w3c/dom/Element;Ljava/lang/StringBuilder;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "getData", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNextSibling", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}