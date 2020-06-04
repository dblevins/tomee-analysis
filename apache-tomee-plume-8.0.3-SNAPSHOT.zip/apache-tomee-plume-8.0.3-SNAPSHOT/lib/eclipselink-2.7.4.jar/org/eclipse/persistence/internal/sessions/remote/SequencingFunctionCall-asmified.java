package asm.org.eclipse.persistence.internal.sessions.remote;
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
public class SequencingFunctionCallDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall$DoesExist", "org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall", "DoesExist", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall$GetNextValue", "org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall", "GetNextValue", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall$WhenShouldAcquireValueForAll", "org/eclipse/persistence/internal/sessions/remote/SequencingFunctionCall", "WhenShouldAcquireValueForAll", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
