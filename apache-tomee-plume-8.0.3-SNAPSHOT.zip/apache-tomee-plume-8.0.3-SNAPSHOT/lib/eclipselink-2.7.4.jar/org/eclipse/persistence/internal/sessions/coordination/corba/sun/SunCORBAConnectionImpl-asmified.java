package asm.org.eclipse.persistence.internal.sessions.coordination.corba.sun;
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
public class SunCORBAConnectionImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionImpl", null, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/_SunCORBAConnectionImplBase", new String[] { "org/eclipse/persistence/internal/sessions/coordination/corba/CORBAConnection" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/_SunCORBAConnectionImplBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionImpl", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeCommand", "([B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionImpl", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/coordination/corba/CORBATransportManager", "processCommand", "([BLorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
