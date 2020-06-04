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
public class AdaptedAccessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "<BeanT:Ljava/lang/Object;InMemValueT:Ljava/lang/Object;OnWireValueT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TOnWireValueT;>;", "com/sun/xml/bind/v2/runtime/reflect/Accessor", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TInMemValueT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "adapter", "Ljava/lang/Class;", "Ljava/lang/Class<+Ljavax/xml/bind/annotation/adapters/XmlAdapter<TOnWireValueT;TInMemValueT;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "staticAdapter", "Ljavax/xml/bind/annotation/adapters/XmlAdapter;", "Ljavax/xml/bind/annotation/adapters/XmlAdapter<TOnWireValueT;TInMemValueT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Class;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;Ljava/lang/Class;)V", "(Ljava/lang/Class<TOnWireValueT;>;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TInMemValueT;>;Ljava/lang/Class<+Ljavax/xml/bind/annotation/adapters/XmlAdapter<TOnWireValueT;TInMemValueT;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "adapter", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAdapted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TBeanT;)TOnWireValueT;", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "getAdapter", "()Ljavax/xml/bind/annotation/adapters/XmlAdapter;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/bind/annotation/adapters/XmlAdapter", "marshal", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "java/lang/Object", "java/lang/Object", "javax/xml/bind/annotation/adapters/XmlAdapter"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/api/AccessorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/AccessorException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "(TBeanT;TOnWireValueT;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "getAdapter", "()Ljavax/xml/bind/annotation/adapters/XmlAdapter;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "java/lang/Object", "java/lang/Object", "javax/xml/bind/annotation/adapters/XmlAdapter"}, 2, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/Accessor", "java/lang/Object"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/bind/annotation/adapters/XmlAdapter", "unmarshal", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "java/lang/Object", "java/lang/Object", "javax/xml/bind/annotation/adapters/XmlAdapter"}, 3, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/Accessor", "java/lang/Object", "java/lang/Object"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/api/AccessorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/AccessorException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnadapted", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TBeanT;)Ljava/lang/Object;", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "getUnadapted", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnadapted", "(Ljava/lang/Object;Ljava/lang/Object;)V", "(TBeanT;Ljava/lang/Object;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "setUnadapted", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAdapter", "()Ljavax/xml/bind/annotation/adapters/XmlAdapter;", "()Ljavax/xml/bind/annotation/adapters/XmlAdapter<TOnWireValueT;TInMemValueT;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/Coordinator", "_getInstance", "()Lcom/sun/xml/bind/v2/runtime/Coordinator;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "adapter", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Coordinator", "getAdapter", "(Ljava/lang/Class;)Ljavax/xml/bind/annotation/adapters/XmlAdapter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/bind/v2/runtime/Coordinator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "staticAdapter", "Ljavax/xml/bind/annotation/adapters/XmlAdapter;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "adapter", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/ClassFactory", "create", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/annotation/adapters/XmlAdapter");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "staticAdapter", "Ljavax/xml/bind/annotation/adapters/XmlAdapter;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/AdaptedAccessor", "staticAdapter", "Ljavax/xml/bind/annotation/adapters/XmlAdapter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
