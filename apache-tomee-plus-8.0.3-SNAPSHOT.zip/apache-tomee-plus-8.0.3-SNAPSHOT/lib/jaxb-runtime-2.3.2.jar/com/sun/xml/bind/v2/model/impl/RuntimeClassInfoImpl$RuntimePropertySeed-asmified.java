package asm.com.sun.xml.bind.v2.model.impl;
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
public class RuntimeClassInfoImpl$RuntimePropertySeedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/impl/PropertySeed<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;", "java/lang/Object", new String[] { "com/sun/xml/bind/v2/model/impl/PropertySeed" });

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl", "RuntimePropertySeed", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/PropertySeed;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", "(Lcom/sun/xml/bind/v2/model/impl/PropertySeed<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/PropertySeed", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)TA;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/PropertySeed", "readAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasAnnotation", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/PropertySeed", "hasAnnotation", "(Ljava/lang/Class;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRawType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/PropertySeed", "getRawType", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Type");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocation", "()Lcom/sun/xml/bind/v2/runtime/Location;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/PropertySeed", "getLocation", "()Lcom/sun/xml/bind/v2/runtime/Location;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUpstream", "()Lcom/sun/xml/bind/v2/model/annotation/Locatable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "core", "Lcom/sun/xml/bind/v2/model/impl/PropertySeed;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/PropertySeed", "getUpstream", "()Lcom/sun/xml/bind/v2/model/annotation/Locatable;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAccessor", "()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getRawType", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/RuntimeClassInfoImpl$RuntimePropertySeed", "getRawType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
