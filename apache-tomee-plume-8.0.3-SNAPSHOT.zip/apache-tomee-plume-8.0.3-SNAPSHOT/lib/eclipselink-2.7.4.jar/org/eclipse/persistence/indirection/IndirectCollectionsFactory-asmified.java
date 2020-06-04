package asm.org.eclipse.persistence.indirection;
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
public class IndirectCollectionsFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/indirection/IndirectCollectionsFactory$DefaultProvider", "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "DefaultProvider", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectCollectionsProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectList_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectSet_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IndirectMap_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "getProvider", "()Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "getListClass", "()Ljava/lang/Class;", true);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectList_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "getSetClass", "()Ljava/lang/Class;", true);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectSet_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "getMapClass", "()Ljava/lang/Class;", true);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectMap_Class", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectList", "()Lorg/eclipse/persistence/indirection/IndirectList;", "<E:Ljava/lang/Object;>()Lorg/eclipse/persistence/indirection/IndirectList<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectList", "(II)Lorg/eclipse/persistence/indirection/IndirectList;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectList", "(I)Lorg/eclipse/persistence/indirection/IndirectList;", "<E:Ljava/lang/Object;>(I)Lorg/eclipse/persistence/indirection/IndirectList<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectList", "(II)Lorg/eclipse/persistence/indirection/IndirectList;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectList", "(Ljava/util/Collection;)Lorg/eclipse/persistence/indirection/IndirectList;", "<E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Lorg/eclipse/persistence/indirection/IndirectList<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectList", "(Ljava/util/Collection;)Lorg/eclipse/persistence/indirection/IndirectList;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectSet", "()Lorg/eclipse/persistence/indirection/IndirectSet;", "<E:Ljava/lang/Object;>()Lorg/eclipse/persistence/indirection/IndirectSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn(new Float("0.75"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectSet", "(IF)Lorg/eclipse/persistence/indirection/IndirectSet;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectSet", "(I)Lorg/eclipse/persistence/indirection/IndirectSet;", "<E:Ljava/lang/Object;>(I)Lorg/eclipse/persistence/indirection/IndirectSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitLdcInsn(new Float("0.75"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectSet", "(IF)Lorg/eclipse/persistence/indirection/IndirectSet;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectSet", "(Ljava/util/Collection;)Lorg/eclipse/persistence/indirection/IndirectSet;", "<E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Lorg/eclipse/persistence/indirection/IndirectSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectSet", "(Ljava/util/Collection;)Lorg/eclipse/persistence/indirection/IndirectSet;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectMap", "()Lorg/eclipse/persistence/indirection/IndirectMap;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>()Lorg/eclipse/persistence/indirection/IndirectMap<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn(new Float("0.75"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectMap", "(IF)Lorg/eclipse/persistence/indirection/IndirectMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectMap", "(I)Lorg/eclipse/persistence/indirection/IndirectMap;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(I)Lorg/eclipse/persistence/indirection/IndirectMap<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitLdcInsn(new Float("0.75"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectMap", "(IF)Lorg/eclipse/persistence/indirection/IndirectMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIndirectMap", "(Ljava/util/Map;)Lorg/eclipse/persistence/indirection/IndirectMap;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;)Lorg/eclipse/persistence/indirection/IndirectMap<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "provider", "Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "createIndirectMap", "(Ljava/util/Map;)Lorg/eclipse/persistence/indirection/IndirectMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getProvider", "()Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$DefaultProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$DefaultProvider", "<init>", "(Lorg/eclipse/persistence/indirection/IndirectCollectionsFactory$DefaultProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
