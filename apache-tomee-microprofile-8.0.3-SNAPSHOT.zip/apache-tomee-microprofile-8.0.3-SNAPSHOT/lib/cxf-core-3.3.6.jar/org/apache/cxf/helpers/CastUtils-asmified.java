package asm.org.apache.cxf.helpers;
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
public class CastUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/helpers/CastUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Map;)Ljava/util/Map;", "<T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/util/Map<**>;)Ljava/util/Map<TT;TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Map;", "<T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/util/Map<**>;Ljava/lang/Class<TT;>;Ljava/lang/Class<TU;>;)Ljava/util/Map<TT;TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Dictionary;)Ljava/util/Dictionary;", "<T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/util/Dictionary<**>;)Ljava/util/Dictionary<TT;TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Dictionary;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Dictionary;", "<T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/util/Dictionary<**>;Ljava/lang/Class<TT;>;Ljava/lang/Class<TU;>;)Ljava/util/Dictionary<TT;TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Collection;)Ljava/util/Collection;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<*>;)Ljava/util/Collection<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "<T:Ljava/lang/Object;>(Ljava/util/Collection<*>;Ljava/lang/Class<TT;>;)Ljava/util/Collection<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/List;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/util/List<*>;)Ljava/util/List<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/util/List<*>;Ljava/lang/Class<TT;>;)Ljava/util/List<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Iterator;)Ljava/util/Iterator;", "<T:Ljava/lang/Object;>(Ljava/util/Iterator<*>;)Ljava/util/Iterator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Iterator;Ljava/lang/Class;)Ljava/util/Iterator;", "<T:Ljava/lang/Object;>(Ljava/util/Iterator<*>;Ljava/lang/Class<TT;>;)Ljava/util/Iterator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Enumeration;)Ljava/util/Enumeration;", "<T:Ljava/lang/Object;>(Ljava/util/Enumeration<*>;)Ljava/util/Enumeration<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Enumeration;Ljava/lang/Class;)Ljava/util/Enumeration;", "<T:Ljava/lang/Object;>(Ljava/util/Enumeration<*>;Ljava/lang/Class<TT;>;)Ljava/util/Enumeration<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Set;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(Ljava/util/Set<*>;)Ljava/util/Set<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Set;Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(Ljava/util/Set<*>;Ljava/lang/Class<TT;>;)Ljava/util/Set<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;", "<T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/util/Map$Entry<**>;)Ljava/util/Map$Entry<TT;TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cast", "(Ljava/util/Map$Entry;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Map$Entry;", "<T:Ljava/lang/Object;U:Ljava/lang/Object;>(Ljava/util/Map$Entry<**>;Ljava/lang/Class<TT;>;Ljava/lang/Class<TU;>;)Ljava/util/Map$Entry<TT;TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
