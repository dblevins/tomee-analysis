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
public class MetadataAsmFactory$MetadataAnnotationArrayVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", null, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataAnnotationArrayVisitor", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataAnnotationVisitor", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "values", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "attributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "values", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "values", "Ljava/util/List;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$200", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnum", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "values", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$200", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "values", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "annotation", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "attributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationArrayVisitor", "values", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "()[Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotation", "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
