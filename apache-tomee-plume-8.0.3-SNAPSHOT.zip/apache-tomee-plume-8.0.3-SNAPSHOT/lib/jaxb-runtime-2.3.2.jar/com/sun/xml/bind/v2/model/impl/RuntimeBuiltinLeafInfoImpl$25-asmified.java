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
public class RuntimeBuiltinLeafInfoImpl$25Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$25", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$StringImpl<Ljava/net/URI;>;", "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$StringImpl", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", null, null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$25", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$StringImpl", "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl", "StringImpl", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_VARARGS, "<init>", "(Ljava/lang/Class;[Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$StringImpl", "<init>", "(Ljava/lang/Class;[Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/lang/CharSequence;)Ljava/net/URI;", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/URISyntaxException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/net/URI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "toString", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URI", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/net/URISyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "handleError", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(Ljava/net/URI;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "print", "(Ljava/lang/Object;)Ljava/lang/String;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URI");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$25", "print", "(Ljava/net/URI;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", null, new String[] { "com/sun/xml/bind/api/AccessorException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$25", "parse", "(Ljava/lang/CharSequence;)Ljava/net/URI;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URI");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$25", "print", "(Ljava/net/URI;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
