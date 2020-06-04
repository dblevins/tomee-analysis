package asm.org.eclipse.persistence.internal.jpa.jpql;
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
public class JPQLQueryHelper$DescriptorCollectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", null, "org/eclipse/persistence/jpa/jpql/parser/AbstractEclipseLinkTraverseChildrenVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper", "DescriptorCollector", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "descriptors", "Ljava/util/Set;", "Ljava/util/Set<Lorg/eclipse/persistence/descriptors/ClassDescriptor;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "queryContext", "Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/AbstractEclipseLinkTraverseChildrenVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "descriptors", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "queryContext", "Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "collectDescriptors", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "populate", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "getDeclarations", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "org/eclipse/persistence/jpa/jpql/parser/Expression", "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/jpql/Declaration");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/Declaration", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "descriptors", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/DeleteClause;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "queryContext", "Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "collectDescriptors", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/FromClause;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "queryContext", "Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "collectDescriptors", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/SimpleSelectStatement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "queryContext", "Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "collectDescriptors", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "getParent", "()Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/UpdateClause;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "queryContext", "Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/DeclarationResolver", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "resolver", "Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "collectDescriptors", "(Lorg/eclipse/persistence/jpa/jpql/parser/Expression;Lorg/eclipse/persistence/internal/jpa/jpql/DeclarationResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/jpql/JPQLQueryHelper$DescriptorCollector", "descriptors", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
