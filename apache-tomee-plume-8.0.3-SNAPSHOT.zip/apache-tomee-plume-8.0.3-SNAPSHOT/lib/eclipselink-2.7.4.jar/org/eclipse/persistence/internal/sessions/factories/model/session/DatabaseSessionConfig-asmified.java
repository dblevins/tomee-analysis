package asm.org.eclipse.persistence.internal.sessions.factories.model.session;
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
public class DatabaseSessionConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", null, "org/eclipse/persistence/internal/sessions/factories/model/session/SessionConfig", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_loginConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/login/LoginConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_additionalProjects", "Ljava/util/Vector;", "Ljava/util/Vector<Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_primaryProject", "Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/model/session/SessionConfig", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAdditionalProjects", "()Ljava/util/Vector;", "()Ljava/util/Vector<Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", "m_additionalProjects", "Ljava/util/Vector;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoginConfig", "()Lorg/eclipse/persistence/internal/sessions/factories/model/login/LoginConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", "m_loginConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/login/LoginConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrimaryProject", "()Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", "m_primaryProject", "Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLoginConfig", "(Lorg/eclipse/persistence/internal/sessions/factories/model/login/LoginConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", "m_loginConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/login/LoginConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrimaryProject", "(Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", "m_primaryProject", "Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAdditionalProjects", "(Ljava/util/Vector;)V", "(Ljava/util/Vector<Lorg/eclipse/persistence/internal/sessions/factories/model/project/ProjectConfig;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/session/DatabaseSessionConfig", "m_additionalProjects", "Ljava/util/Vector;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
