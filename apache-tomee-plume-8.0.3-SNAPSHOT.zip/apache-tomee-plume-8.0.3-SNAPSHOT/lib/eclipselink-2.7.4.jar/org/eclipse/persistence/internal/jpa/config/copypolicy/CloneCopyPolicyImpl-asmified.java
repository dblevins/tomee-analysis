package asm.org.eclipse.persistence.internal.jpa.config.copypolicy;
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
public class CloneCopyPolicyImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/config/copypolicy/CloneCopyPolicyImpl", "Lorg/eclipse/persistence/internal/jpa/config/MetadataImpl<Lorg/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata;>;Lorg/eclipse/persistence/jpa/config/CloneCopyPolicy;", "org/eclipse/persistence/internal/jpa/config/MetadataImpl", new String[] { "org/eclipse/persistence/jpa/config/CloneCopyPolicy" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/config/MetadataImpl", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMethodName", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/CloneCopyPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/config/copypolicy/CloneCopyPolicyImpl", "getMetadata", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata", "setMethodName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWorkingCopyMethodName", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/config/CloneCopyPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/config/copypolicy/CloneCopyPolicyImpl", "getMetadata", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/copypolicy/CloneCopyPolicyMetadata", "setWorkingCopyMethodName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
