package asm.jakarta.persistence.spi;
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
public class PersistenceProviderResolverHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/persistence/spi/PersistenceProviderResolverHolder", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/persistence/spi/PersistenceProviderResolverHolder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/persistence/spi/PersistenceProviderResolverHolder$DefaultPersistenceProviderResolver", "jakarta/persistence/spi/PersistenceProviderResolverHolder", "DefaultPersistenceProviderResolver", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPersistenceProviderResolver", "()Ljakarta/persistence/spi/PersistenceProviderResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setPersistenceProviderResolver", "(Ljakarta/persistence/spi/PersistenceProviderResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/spi/PersistenceProviderResolver", "clearCachedProviders", "()V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/spi/PersistenceProviderResolverHolder$DefaultPersistenceProviderResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/spi/PersistenceProviderResolverHolder$DefaultPersistenceProviderResolver", "<init>", "(Ljakarta/persistence/spi/PersistenceProviderResolverHolder$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/spi/PersistenceProviderResolverHolder$DefaultPersistenceProviderResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/spi/PersistenceProviderResolverHolder$DefaultPersistenceProviderResolver", "<init>", "(Ljakarta/persistence/spi/PersistenceProviderResolverHolder$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/spi/PersistenceProviderResolverHolder", "persistenceResolver", "Ljakarta/persistence/spi/PersistenceProviderResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
