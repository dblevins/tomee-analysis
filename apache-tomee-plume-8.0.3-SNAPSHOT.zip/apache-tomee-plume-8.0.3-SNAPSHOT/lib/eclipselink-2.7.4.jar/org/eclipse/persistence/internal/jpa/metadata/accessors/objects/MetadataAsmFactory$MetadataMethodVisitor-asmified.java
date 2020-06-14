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
public class MetadataAsmFactory$MetadataMethodVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", null, "org/eclipse/persistence/internal/libraries/asm/MethodVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataMethodVisitor", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataAnnotationVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "MetadataAnnotationVisitor", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/MethodVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataFactory;Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/Helper", "getAttributeNameFromMethodName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setModifiers", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$100", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setGenericType", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "access$100", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setReturnType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setParameters", "(Ljava/util/List;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass", Opcodes.INTEGER, "java/lang/String", "java/lang/String", "java/lang/String", "[Ljava/lang/String;", "java/util/List"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "this$0", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "getMetadataClass", "()Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass", "getMethods", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass", "getMethods", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataClass", "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "getNext", "()Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "getNext", "()Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataAsmFactory$MetadataMethodVisitor", "method", "Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod", "setNext", "(Lorg/eclipse/persistence/internal/jpa/metadata/accessors/objects/MetadataMethod;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
