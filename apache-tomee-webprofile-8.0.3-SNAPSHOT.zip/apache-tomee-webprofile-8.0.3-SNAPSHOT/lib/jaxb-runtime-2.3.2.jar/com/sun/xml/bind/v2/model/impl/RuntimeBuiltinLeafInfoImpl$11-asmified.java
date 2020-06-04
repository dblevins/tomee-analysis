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
public class RuntimeBuiltinLeafInfoImpl$11Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$11", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$PcdataImpl<Ljavax/activation/DataHandler;>;", "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$PcdataImpl", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", null, null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$11", null, null, 0);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/lang/CharSequence;)Ljavax/activation/DataHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "getDataHandler", "()Ljavax/activation/DataHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/activation/DataHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/istack/ByteArrayDataSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", "access$100", "(Ljava/lang/CharSequence;)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getXMIMEContentType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/istack/ByteArrayDataSource", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/activation/DataHandler", "<init>", "(Ljavax/activation/DataSource;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(Ljavax/activation/DataHandler;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/Base64Data", "set", "(Ljavax/activation/DataHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "print", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/runtime/output/Pcdata;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/activation/DataHandler");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$11", "print", "(Ljavax/activation/DataHandler;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", null, new String[] { "com/sun/xml/bind/api/AccessorException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$11", "parse", "(Ljava/lang/CharSequence;)Ljavax/activation/DataHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/activation/DataHandler");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$11", "print", "(Ljavax/activation/DataHandler;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Base64Data;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
