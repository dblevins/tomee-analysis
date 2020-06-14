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
public class MetadataAsmFactory$MetadataFieldVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", null, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataFieldVisitor", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataAnnotationVisitor", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/FieldVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "setModifiers", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$100", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "setGenericType", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$100", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "setType", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Ljavax/persistence");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Ljakarta/persistence");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Lorg/eclipse/persistence");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAnnotatedElement;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField", "getDeclaringClass", "()Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataFieldVisitor", "field", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass", "addField", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataField;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
