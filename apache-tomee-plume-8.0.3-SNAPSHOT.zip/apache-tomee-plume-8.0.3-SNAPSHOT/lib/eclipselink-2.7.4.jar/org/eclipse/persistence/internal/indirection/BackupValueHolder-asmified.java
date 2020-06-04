package asm.org.eclipse.persistence.internal.indirection;
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
public class BackupValueHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/indirection/BackupValueHolder", null, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/indirection/ValueHolderInterface;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPessimisticLockingValueHolder", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "isPessimisticLockingValueHolder", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiateForUnitOfWorkValueHolder", "(Lorg/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "instantiateForUnitOfWorkValueHolder", "(Lorg/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRow", "()Lorg/eclipse/persistence/internal/sessions/AbstractRecord;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "getRow", "()Lorg/eclipse/persistence/internal/sessions/AbstractRecord;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiate", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/ValueHolderInterface", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnitOfWorkValueHolder", "()Lorg/eclipse/persistence/indirection/ValueHolderInterface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BackupValueHolder", "unitOfWorkValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
