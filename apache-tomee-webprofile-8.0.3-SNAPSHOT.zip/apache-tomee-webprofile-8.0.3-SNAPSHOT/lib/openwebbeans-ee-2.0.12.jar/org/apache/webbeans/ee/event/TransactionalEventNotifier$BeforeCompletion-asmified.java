package asm.org.apache.webbeans.ee.event;
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
public class TransactionalEventNotifier$BeforeCompletionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/webbeans/ee/event/TransactionalEventNotifier$BeforeCompletion", null, "org/apache/webbeans/ee/event/TransactionalEventNotifier$AbstractSynchronization", null);

classWriter.visitInnerClass("org/apache/webbeans/ee/event/TransactionalEventNotifier$BeforeCompletion", "org/apache/webbeans/ee/event/TransactionalEventNotifier", "BeforeCompletion", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/ee/event/TransactionalEventNotifier$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/webbeans/ee/event/TransactionalEventNotifier$AbstractSynchronization", "org/apache/webbeans/ee/event/TransactionalEventNotifier", "AbstractSynchronization", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/enterprise/inject/spi/ObserverMethod;Ljava/lang/Object;Ljakarta/enterprise/inject/spi/EventMetadata;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/ee/event/TransactionalEventNotifier$AbstractSynchronization", "<init>", "(Ljakarta/enterprise/inject/spi/ObserverMethod;Ljava/lang/Object;Ljakarta/enterprise/inject/spi/EventMetadata;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeCompletion", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/ee/event/TransactionalEventNotifier$BeforeCompletion", "notifyObserver", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/enterprise/inject/spi/ObserverMethod;Ljava/lang/Object;Ljakarta/enterprise/inject/spi/EventMetadata;Lorg/apache/webbeans/ee/event/TransactionalEventNotifier$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/ee/event/TransactionalEventNotifier$BeforeCompletion", "<init>", "(Ljakarta/enterprise/inject/spi/ObserverMethod;Ljava/lang/Object;Ljakarta/enterprise/inject/spi/EventMetadata;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
