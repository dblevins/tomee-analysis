package asm.org.eclipse.persistence.internal.sessions.factories;
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
public class MissingDescriptorListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/MissingDescriptorListener", null, "org/eclipse/persistence/sessions/SessionEventAdapter", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "XML_TYPE_CLASS", "Ljava/lang/String;", null, "org.eclipse.persistence.mappings.xdb.DirectToXMLTypeMapping");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "EIS_DESCRIPTOR_CLASS", "Ljava/lang/String;", null, "org.eclipse.persistence.eis.EISDescriptor");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "XML_INTERACTION_CLASS", "Ljava/lang/String;", null, "org.eclipse.persistence.eis.interactions.XMLInteraction");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "EIS_LOGIN_CLASS", "Ljava/lang/String;", null, "org.eclipse.persistence.eis.EISLogin");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "XML_BINARY_MAPPING_CLASS", "Ljava/lang/String;", null, "org.eclipse.persistence.oxm.mappings.XMLBinaryDataMapping");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "XML_BINARY_COLLECTION_MAPPING_CLASS", "Ljava/lang/String;", null, "org.eclipse.persistence.oxm.mappings.XMLBinaryDataCollectionMapping");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/SessionEventAdapter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "missingDescriptor", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/SessionEvent", "getResult", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/SessionEvent", "getSession", "()Lorg/eclipse/persistence/sessions/Session;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/AbstractSession");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getRootSession", "(Lorg/eclipse/persistence/queries/DatabaseQuery;)Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sessions/DatabaseSession");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/DatabaseSession", "getProject", "()Lorg/eclipse/persistence/sessions/Project;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject", "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/internal/sessions/factories/MissingDescriptorListener", "org/eclipse/persistence/sessions/SessionEvent", "java/lang/String", "org/eclipse/persistence/sessions/DatabaseSession", "org/eclipse/persistence/sessions/Project", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/factories/DirectToXMLTypeMappingHelper", "getInstance", "()Lorg/eclipse/persistence/internal/sessions/factories/DirectToXMLTypeMappingHelper;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/DatabaseSessionImpl");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/DirectToXMLTypeMappingHelper", "addXDBDescriptors", "(Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/DatabaseSessionImpl;Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.eclipse.persistence.eis.EISDescriptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.eclipse.persistence.eis.interactions.XMLInteraction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.eclipse.persistence.eis.EISLogin");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedClassForName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.eis.interactions.XMLInteraction");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedClassForName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label1);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/internal/sessions/factories/MissingDescriptorListener", "org/eclipse/persistence/sessions/SessionEvent", "java/lang/String", "org/eclipse/persistence/sessions/DatabaseSession", "org/eclipse/persistence/sessions/Project", "java/lang/String", "org/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes", "java/lang/Class"}, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/ClassNotFoundException");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassNotFoundException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/PrivilegedActionException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/RuntimeException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitLdcInsn("org.eclipse.persistence.eis.interactions.XMLInteraction");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/queries/Call;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/DatabaseSession", "getDescriptor", "(Ljava/lang/Class;)Lorg/eclipse/persistence/descriptors/ClassDescriptor;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getInheritancePolicy", "()Lorg/eclipse/persistence/descriptors/InheritancePolicy;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("xml-interaction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/InheritancePolicy", "addClassIndicator", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/internal/sessions/factories/MissingDescriptorListener", "org/eclipse/persistence/sessions/SessionEvent", "java/lang/String", "org/eclipse/persistence/sessions/DatabaseSession", "org/eclipse/persistence/sessions/Project", "java/lang/String", "org/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "fatalErrorOccurred", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/eis/EISObjectPersistenceXMLProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISObjectPersistenceXMLProject", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/DatabaseSession", "addDescriptors", "(Lorg/eclipse/persistence/sessions/Project;)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.eclipse.persistence.oxm.mappings.XMLBinaryDataMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("org.eclipse.persistence.oxm.mappings.XMLBinaryDataCollectionMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/DatabaseSession", "addDescriptors", "(Lorg/eclipse/persistence/sessions/Project;)V", true);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
