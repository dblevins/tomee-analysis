package asm.com.sun.xml.bind.v2.model.impl;
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
public class RuntimeBuiltinLeafInfoImpl$12Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$12", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$PcdataImpl<Ljavax/xml/transform/Source;>;", "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$PcdataImpl", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", null, null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$12", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$PcdataImpl", "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", "PcdataImpl", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_VARARGS, "<init>", "(Ljava/lang/Class;[Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$PcdataImpl", "<init>", "(Ljava/lang/Class;[Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/lang/CharSequence;)Ljavax/xml/transform/Source;", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/activation/MimeTypeParseException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "jakarta/activation/MimeTypeParseException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/util/DataSourceSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "getDataHandler", "()Ljakarta/activation/DataHandler;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/util/DataSourceSource", "<init>", "(Ljakarta/activation/DataHandler;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/util/DataSourceSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/istack/ByteArrayDataSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", "access$100", "(Ljava/lang/CharSequence;)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getXMIMEContentType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/istack/ByteArrayDataSource", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/util/DataSourceSource", "<init>", "(Ljakarta/activation/DataSource;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/activation/MimeTypeParseException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "handleError", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(Ljavax/xml/transform/Source;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/activation/MimeTypeParseException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/xml/transform/TransformerException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, "java/io/UnsupportedEncodingException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/XMLSerializer", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/XMLSerializer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "getXMIMEContentType", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/activation/MimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/activation/MimeType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$12", "javax/xml/transform/Source", "com/sun/xml/bind/v2/runtime/XMLSerializer", "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "java/lang/String", "jakarta/activation/MimeType"}, 1, new Object[] {"jakarta/activation/MimeTypeParseException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "handleError", "(Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/xml/bind/v2/util/DataSourceSource");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/util/DataSourceSource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/util/DataSourceSource", "getDataSource", "()Ljakarta/activation/DataSource;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/activation/DataSource", "getContentType", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"jakarta/activation/DataSource", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "jakarta/activation/DataHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/activation/DataHandler", "<init>", "(Ljakarta/activation/DataSource;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "set", "(Ljakarta/activation/DataHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("charset");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/activation/MimeType", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/util/ByteArrayOutputStreamEx");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/util/ByteArrayOutputStreamEx", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "getIdentityTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("encoding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "getOutputProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("encoding");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/OutputStreamWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/OutputStreamWriter", "<init>", "(Ljava/io/OutputStream;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamResult", "<init>", "(Ljava/io/Writer;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("encoding");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("application/xml; charset=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/util/ByteArrayOutputStreamEx", "set", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/transform/TransformerException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "handleError", "(Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(POP);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "handleError", "(Ljava/lang/Exception;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitLdcInsn("application/xml");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "set", "([BLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "print", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/runtime/output/Pcdata;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/transform/Source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$12", "print", "(Ljavax/xml/transform/Source;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", null, new String[] { "com/sun/xml/bind/api/AccessorException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$12", "parse", "(Ljava/lang/CharSequence;)Ljavax/xml/transform/Source;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/transform/Source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$12", "print", "(Ljavax/xml/transform/Source;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
