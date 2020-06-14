package asm.org.eclipse.persistence.internal.jpa.metadata.accessors.objects;
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
public class MetadataAsmFactory$MetadataAnnotationVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", null, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataAnnotationVisitor", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataAnnotationArrayVisitor", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "element", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;Ljava/lang/String;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "element", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$100", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ILOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement", "java/lang/String", Opcodes.INTEGER}, 1, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement", "java/lang/String", Opcodes.INTEGER}, 2, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "setIsMeta", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$200", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnum", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$200", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$100", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitArray", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "element", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "isMeta", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "element", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement", "addMetaAnnotation", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "element", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement", "addAnnotation", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
