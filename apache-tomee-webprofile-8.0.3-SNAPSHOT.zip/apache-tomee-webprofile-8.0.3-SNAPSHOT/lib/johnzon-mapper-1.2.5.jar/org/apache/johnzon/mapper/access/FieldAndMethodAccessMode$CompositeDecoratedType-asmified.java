package asm.org.apache.johnzon.mapper.access;
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
public class FieldAndMethodAccessMode$CompositeDecoratedTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "<T::Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;>Ljava/lang/Object;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;", "java/lang/Object", new String[] { "org/apache/johnzon/mapper/access/AccessMode$DecoratedType" });

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "org/apache/johnzon/mapper/access/AccessMode", "DecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode", "CompositeDecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;", "TT;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;)V", "(TT;TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassOrPackageAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "getClassOrPackageAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "getClassOrPackageAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/annotation/Annotation"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/annotation/Annotation"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findConverter", "()Lorg/apache/johnzon/mapper/Adapter;", "()Lorg/apache/johnzon/mapper/Adapter<**>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "findConverter", "()Lorg/apache/johnzon/mapper/Adapter;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/johnzon/mapper/Adapter"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "findConverter", "()Lorg/apache/johnzon/mapper/Adapter;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/johnzon/mapper/Adapter"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/annotation/Annotation"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/annotation/Annotation"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "getType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNillable", "(Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "isNillable", "(Z)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "isNillable", "(Z)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType1", "()Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType2", "()Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("CompositeDecoratedType{type1=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", type2=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/mapper/access/FieldAndMethodAccessMode$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
