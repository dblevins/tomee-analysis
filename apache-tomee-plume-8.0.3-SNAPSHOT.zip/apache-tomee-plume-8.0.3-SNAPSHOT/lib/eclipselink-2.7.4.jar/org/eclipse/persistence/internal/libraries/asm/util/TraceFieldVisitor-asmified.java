package asm.org.eclipse.persistence.internal.libraries.asm.util;
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
public class TraceFieldVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", null, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "p", "Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/FieldVisitor;Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/FieldVisitor;Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/FieldVisitor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", "p", "Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", "p", "Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/util/Printer", "visitFieldAnnotation", "(Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/TraceAnnotationVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "visitAnnotation", "(Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/TraceAnnotationVisitor", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitTypeAnnotation", "(ILorg/eclipse/persistence/internal/libraries/asm/TypePath;Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", "p", "Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/util/Printer", "visitFieldTypeAnnotation", "(ILorg/eclipse/persistence/internal/libraries/asm/TypePath;Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/util/TraceAnnotationVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "visitTypeAnnotation", "(ILorg/eclipse/persistence/internal/libraries/asm/TypePath;Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/util/TraceAnnotationVisitor", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAttribute", "(Lorg/eclipse/persistence/internal/libraries/asm/Attribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", "p", "Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/util/Printer", "visitFieldAttribute", "(Lorg/eclipse/persistence/internal/libraries/asm/Attribute;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "visitAttribute", "(Lorg/eclipse/persistence/internal/libraries/asm/Attribute;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/util/TraceFieldVisitor", "p", "Lorg/eclipse/persistence/internal/libraries/asm/util/Printer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/util/Printer", "visitFieldEnd", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "visitEnd", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
