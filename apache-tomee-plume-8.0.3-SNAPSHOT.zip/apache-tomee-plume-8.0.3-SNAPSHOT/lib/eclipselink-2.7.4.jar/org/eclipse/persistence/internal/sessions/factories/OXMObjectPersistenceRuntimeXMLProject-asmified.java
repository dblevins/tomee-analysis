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
public class OXMObjectPersistenceRuntimeXMLProjectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", null, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/NamespaceResolvableProject", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/NamespaceResolverWithPrefixes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildDescriptors", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "buildXMLBinaryDataMappingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "addDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "buildXMLBinaryDataCollectionMappingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "addDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildXMLBinaryDataMappingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLDescriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLDescriptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/oxm/mappings/XMLBinaryDataMapping;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setJavaClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "getInheritancePolicy", "()Lorg/eclipse/persistence/descriptors/InheritancePolicy;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/oxm/mappings/XMLDirectMapping;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/InheritancePolicy", "setParentClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("isSwaRef");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("is-swa-ref/text()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("mimeTypePolicy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("getMimeType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setGetMethodName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("setMimeType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setSetMethodName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("mime-type/text()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("shouldInlineBinaryData");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("should-inline-data");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildXMLBinaryDataCollectionMappingDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLDescriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLDescriptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/oxm/mappings/XMLBinaryDataCollectionMapping;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setJavaClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "getInheritancePolicy", "()Lorg/eclipse/persistence/descriptors/InheritancePolicy;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/oxm/mappings/XMLCompositeDirectCollectionMapping;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/InheritancePolicy", "setParentClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("isSwaRef");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("is-swa-ref/text()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("mimeTypePolicy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("getMimeType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setGetMethodName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("setMimeType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setSetMethodName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("mime-type/text()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("shouldInlineBinaryData");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/OXMObjectPersistenceRuntimeXMLProject", "getPrimaryNamespaceXPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("should-inline-data");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
