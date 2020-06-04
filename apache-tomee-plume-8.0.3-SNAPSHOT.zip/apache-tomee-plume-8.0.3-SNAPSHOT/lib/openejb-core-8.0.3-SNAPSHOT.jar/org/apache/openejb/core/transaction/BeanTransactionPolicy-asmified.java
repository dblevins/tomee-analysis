package asm.org.apache.openejb.core.transaction;
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
public class BeanTransactionPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/core/transaction/BeanTransactionPolicy", null, "java/lang/Object", new String[] { "org/apache/openejb/core/transaction/TransactionPolicy" });

classWriter.visitInnerClass("org/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction", "org/apache/openejb/core/transaction/BeanTransactionPolicy", "SuspendedTransaction", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUserTransaction", "()Ljavax/transaction/UserTransaction;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "suspendUserTransaction", "()Lorg/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction;", null, new String[] { "org/apache/openejb/SystemException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeUserTransaction", "(Lorg/apache/openejb/core/transaction/BeanTransactionPolicy$SuspendedTransaction;)V", null, new String[] { "org/apache/openejb/SystemException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
