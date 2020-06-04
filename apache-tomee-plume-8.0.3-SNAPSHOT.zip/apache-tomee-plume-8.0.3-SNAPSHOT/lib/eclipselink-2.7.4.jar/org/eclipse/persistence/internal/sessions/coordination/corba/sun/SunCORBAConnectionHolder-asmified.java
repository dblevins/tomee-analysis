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
public class SunCORBAConnectionHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHolder", null, "java/lang/Object", new String[] { "org/omg/CORBA/portable/Streamable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "value", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHolder", "value", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHolder", "value", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHolder", "value", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_read", "(Lorg/omg/CORBA/portable/InputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHelper", "read", "(Lorg/omg/CORBA/portable/InputStream;)Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHolder", "value", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_write", "(Lorg/omg/CORBA/portable/OutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHolder", "value", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHelper", "write", "(Lorg/omg/CORBA/portable/OutputStream;Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_type", "()Lorg/omg/CORBA/TypeCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/SunCORBAConnectionHelper", "type", "()Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
