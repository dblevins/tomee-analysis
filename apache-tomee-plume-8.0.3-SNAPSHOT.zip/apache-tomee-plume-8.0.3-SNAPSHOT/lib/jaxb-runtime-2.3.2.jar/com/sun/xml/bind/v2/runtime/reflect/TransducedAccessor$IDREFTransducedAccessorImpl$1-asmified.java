package asm.com.sun.xml.bind.v2.runtime.reflect;
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
public class TransducedAccessor$IDREFTransducedAccessorImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", null, "java/lang/Object", new String[] { "com/sun/xml/bind/v2/runtime/unmarshaller/Patcher" });

classWriter.visitOuterClass("com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl", "parse", "(Ljava/lang/Object;Ljava/lang/CharSequence;)V");

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl", "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "IDREFTransducedAccessorImpl", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$callable", "Ljava/util/concurrent/Callable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$context", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$bean", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$idref", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$loc", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/LocatorEx;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl;Ljava/util/concurrent/Callable;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;Ljava/lang/Object;Ljava/lang/String;Lcom/sun/xml/bind/v2/runtime/unmarshaller/LocatorEx;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$callable", "Ljava/util/concurrent/Callable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$context", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$bean", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$idref", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$loc", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/LocatorEx;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/xml/bind/api/AccessorException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/xml/sax/SAXException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/lang/RuntimeException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label5, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$callable", "Ljava/util/concurrent/Callable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Callable", "call", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$context", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$bean", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$idref", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$loc", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/LocatorEx;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "errorUnresolvedIDREF", "(Ljava/lang/Object;Ljava/lang/String;Lcom/sun/xml/bind/v2/runtime/unmarshaller/LocatorEx;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "this$0", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$bean", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$context", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl", "access$000", "(Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl;Ljava/lang/Object;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/api/AccessorException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor$IDREFTransducedAccessorImpl$1", "val$context", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "handleError", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/xml/sax/SAXException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/istack/SAXException2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/istack/SAXException2", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
