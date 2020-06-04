package asm.org.eclipse.persistence.internal.libraries.asm.xml;
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
public class SAXFieldAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_DEPRECATED, "org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", null, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sa", "Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(393216));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", "sa", "Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("field");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter", "addStart", "(Ljava/lang/String;Lorg/xml/sax/Attributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAnnotationAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", "sa", "Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;");
methodVisitor.visitLdcInsn("annotation");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", "java/lang/String", Opcodes.INTEGER}, 4, new Object[] {label0, label0, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter", "java/lang/String"});
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", "java/lang/String", Opcodes.INTEGER}, 5, new Object[] {label0, label0, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter", "java/lang/String", Opcodes.INTEGER});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAnnotationAdapter", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitTypeAnnotation", "(ILorg/eclipse/persistence/internal/libraries/asm/TypePath;Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAnnotationAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", "sa", "Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;");
methodVisitor.visitLdcInsn("typeAnnotation");
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", Opcodes.INTEGER, "org/eclipse/persistence/internal/libraries/asm/TypePath", "java/lang/String", Opcodes.INTEGER}, 4, new Object[] {label0, label0, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter", "java/lang/String"});
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", Opcodes.INTEGER, "org/eclipse/persistence/internal/libraries/asm/TypePath", "java/lang/String", Opcodes.INTEGER}, 5, new Object[] {label0, label0, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter", "java/lang/String", Opcodes.INTEGER});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAnnotationAdapter", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILorg/eclipse/persistence/internal/libraries/asm/TypePath;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/SAXFieldAdapter", "sa", "Lorg/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter;");
methodVisitor.visitLdcInsn("field");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/SAXAdapter", "addEnd", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
