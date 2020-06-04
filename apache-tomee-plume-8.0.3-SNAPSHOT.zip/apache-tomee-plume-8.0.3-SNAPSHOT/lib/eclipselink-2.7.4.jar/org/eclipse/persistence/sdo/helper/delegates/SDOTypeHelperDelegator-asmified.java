package asm.org.eclipse.persistence.sdo.helper.delegates;
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
public class SDOTypeHelperDelegatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", null, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", new String[] { "org/eclipse/persistence/sdo/helper/SDOTypeHelper" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaWrapperTypeForSDOType", "(Lcommonj/sdo/Type;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getJavaWrapperTypeForSDOType", "(Lcommonj/sdo/Type;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getType", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/sdo/SDOType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeForSimpleJavaType", "(Ljava/lang/Class;)Lcommonj/sdo/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getTypeForSimpleJavaType", "(Ljava/lang/Class;)Lorg/eclipse/persistence/sdo/SDOType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addType", "(Lorg/eclipse/persistence/sdo/SDOType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "addType", "(Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "(Ljava/lang/Class;)Lcommonj/sdo/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getType", "(Ljava/lang/Class;)Lorg/eclipse/persistence/sdo/SDOType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeForImplClass", "(Ljava/lang/Class;)Lorg/eclipse/persistence/sdo/SDOType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getTypeForImplClass", "(Ljava/lang/Class;)Lorg/eclipse/persistence/sdo/SDOType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "define", "(Lcommonj/sdo/DataObject;)Lcommonj/sdo/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "define", "(Lcommonj/sdo/DataObject;)Lcommonj/sdo/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "define", "(Ljava/util/List;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "define", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXSDTypeFromSDOType", "(Lcommonj/sdo/Type;)Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getXSDTypeFromSDOType", "(Lcommonj/sdo/Type;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSDOTypeFromXSDType", "(Ljavax/xml/namespace/QName;)Lorg/eclipse/persistence/sdo/SDOType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getSDOTypeFromXSDType", "(Ljavax/xml/namespace/QName;)Lorg/eclipse/persistence/sdo/SDOType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTypesHashMap", "(Ljava/util/Map;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "setTypesHashMap", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypesHashMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getTypesHashMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrappersHashMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getWrappersHashMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWrappersHashMap", "(Ljava/util/Map;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "setWrappersHashMap", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "defineOpenContentProperty", "(Ljava/lang/String;Lcommonj/sdo/DataObject;)Lcommonj/sdo/Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "defineOpenContentProperty", "(Ljava/lang/String;Lcommonj/sdo/DataObject;)Lcommonj/sdo/Property;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOpenContentProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getOpenContentProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/Property;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sdo/helper/SDOHelperContext", "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getTypeHelper", "()Lcommonj/sdo/helper/TypeHelper;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNamespace", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "addNamespace", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOpenContentProperties", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getOpenContentProperties", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWrappersToProject", "(Lorg/eclipse/persistence/sessions/Project;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "addWrappersToProject", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInterfacesToSDOTypeHashMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getInterfacesToSDOTypeHashMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImplClassesToSDOType", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;Lorg/eclipse/persistence/sdo/SDOType;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getImplClassesToSDOType", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnonymousTypes", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "getTypeHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "getAnonymousTypes", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
