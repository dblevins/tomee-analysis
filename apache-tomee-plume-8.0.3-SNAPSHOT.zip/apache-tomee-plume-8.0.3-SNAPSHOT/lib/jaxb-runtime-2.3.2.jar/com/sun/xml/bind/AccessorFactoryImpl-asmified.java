package asm.com.sun.xml.bind;
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
public class AccessorFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/bind/AccessorFactoryImpl", null, "java/lang/Object", new String[] { "com/sun/xml/bind/InternalAccessorFactory" });

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Accessor$ReadOnlyFieldReflection", "com/sun/xml/bind/v2/runtime/reflect/Accessor", "ReadOnlyFieldReflection", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection", "com/sun/xml/bind/v2/runtime/reflect/Accessor", "FieldReflection", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Accessor$SetterOnlyReflection", "com/sun/xml/bind/v2/runtime/reflect/Accessor", "SetterOnlyReflection", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Accessor$GetterOnlyReflection", "com/sun/xml/bind/v2/runtime/reflect/Accessor", "GetterOnlyReflection", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Accessor$GetterSetterReflection", "com/sun/xml/bind/v2/runtime/reflect/Accessor", "GetterSetterReflection", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "instance", "Lcom/sun/xml/bind/AccessorFactoryImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lcom/sun/xml/bind/AccessorFactoryImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/AccessorFactoryImpl", "instance", "Lcom/sun/xml/bind/AccessorFactoryImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createFieldAccessor", "(Ljava/lang/Class;Ljava/lang/reflect/Field;Z)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$ReadOnlyFieldReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$ReadOnlyFieldReflection", "<init>", "(Ljava/lang/reflect/Field;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection", "<init>", "(Ljava/lang/reflect/Field;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createFieldAccessor", "(Ljava/lang/Class;Ljava/lang/reflect/Field;ZZ)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$ReadOnlyFieldReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$ReadOnlyFieldReflection", "<init>", "(Ljava/lang/reflect/Field;Z)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection", "<init>", "(Ljava/lang/reflect/Field;Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/v2/runtime/reflect/Accessor$FieldReflection"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPropertyAccessor", "(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$SetterOnlyReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$SetterOnlyReflection", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$GetterOnlyReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$GetterOnlyReflection", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Accessor$GetterSetterReflection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor$GetterSetterReflection", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/AccessorFactoryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/AccessorFactoryImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/AccessorFactoryImpl", "instance", "Lcom/sun/xml/bind/AccessorFactoryImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
