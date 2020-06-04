package asm.org.eclipse.persistence.jpa.rs.util;
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
public class StreamingOutputMarshaller$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jpa/rs/util/StreamingOutputMarshaller$1", null, "javax/xml/bind/Marshaller$Listener", null);

classWriter.visitOuterClass("org/eclipse/persistence/jpa/rs/util/StreamingOutputMarshaller", "createMarshaller", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljavax/ws/rs/core/MediaType;)Ljavax/xml/bind/Marshaller;");

classWriter.visitInnerClass("javax/xml/bind/Marshaller$Listener", "javax/xml/bind/Marshaller", "Listener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/rs/util/StreamingOutputMarshaller$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/Marshaller$Listener", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeMarshal", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/dynamic/DynamicEntity");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/dynamic/DynamicEntityImpl");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/dynamic/DynamicEntityImpl", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/dynamic/DynamicEntityImpl", "_persistence_setPropertyChangeListener", "(Ljava/beans/PropertyChangeListener;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/dynamic/DynamicEntity");
methodVisitor.visitLdcInsn("self");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/dynamic/DynamicEntity", "set", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/persistence/dynamic/DynamicEntity;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/dynamic/DynamicEntityImpl", "_persistence_setPropertyChangeListener", "(Ljava/beans/PropertyChangeListener;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
